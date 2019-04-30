--
-- PostgreSQL database dump
--

-- Dumped from database version 10.3
-- Dumped by pg_dump version 10.3

-- Started on 2019-04-30 18:55:19

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET default_with_oids = false;

--
-- TOC entry 197 (class 1259 OID 16396)
-- Name: brand; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.brand (
    id integer NOT NULL,
    name character varying(50) NOT NULL,
    created timestamp without time zone DEFAULT now() NOT NULL,
    updated time without time zone DEFAULT now() NOT NULL
);


--
-- TOC entry 196 (class 1259 OID 16394)
-- Name: brand_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.brand_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2842 (class 0 OID 0)
-- Dependencies: 196
-- Name: brand_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.brand_id_seq OWNED BY public.brand.id;


--
-- TOC entry 200 (class 1259 OID 16438)
-- Name: car; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.car (
    id integer NOT NULL,
    vin character varying,
    model_id integer NOT NULL,
    update time without time zone DEFAULT now() NOT NULL,
    created time without time zone DEFAULT now() NOT NULL
);


--
-- TOC entry 201 (class 1259 OID 16453)
-- Name: car_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.car_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2843 (class 0 OID 0)
-- Dependencies: 201
-- Name: car_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.car_id_seq OWNED BY public.car.id;


--
-- TOC entry 198 (class 1259 OID 16412)
-- Name: model; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.model (
    id integer NOT NULL,
    name character varying NOT NULL,
    created timestamp without time zone DEFAULT now() NOT NULL,
    updated time without time zone DEFAULT now() NOT NULL,
    "brand-id" integer NOT NULL
);


--
-- TOC entry 199 (class 1259 OID 16415)
-- Name: model_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.model_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2844 (class 0 OID 0)
-- Dependencies: 199
-- Name: model_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.model_id_seq OWNED BY public.model.id;


--
-- TOC entry 2684 (class 2604 OID 16399)
-- Name: brand id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.brand ALTER COLUMN id SET DEFAULT nextval('public.brand_id_seq'::regclass);


--
-- TOC entry 2690 (class 2604 OID 16455)
-- Name: car id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.car ALTER COLUMN id SET DEFAULT nextval('public.car_id_seq'::regclass);


--
-- TOC entry 2687 (class 2604 OID 16417)
-- Name: model id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.model ALTER COLUMN id SET DEFAULT nextval('public.model_id_seq'::regclass);


--
-- TOC entry 2831 (class 0 OID 16396)
-- Dependencies: 197
-- Data for Name: brand; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO public.brand (id, name, created, updated) VALUES (1, 'VW', '2019-04-24 20:22:44.420842', '20:22:44.420842');
INSERT INTO public.brand (id, name, created, updated) VALUES (2, 'Gelly', '2019-04-24 20:23:20.27339', '20:23:20.27339');
INSERT INTO public.brand (id, name, created, updated) VALUES (3, 'Audi', '2019-04-24 20:23:20.27339', '20:23:20.27339');
INSERT INTO public.brand (id, name, created, updated) VALUES (4, 'Opel', '2019-04-26 18:47:25.133466', '18:47:25.133466');


--
-- TOC entry 2834 (class 0 OID 16438)
-- Dependencies: 200
-- Data for Name: car; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO public.car (id, vin, model_id, update, created) VALUES (2, 'Jetta002', 2, '20:42:17.277063', '20:42:17.277063');
INSERT INTO public.car (id, vin, model_id, update, created) VALUES (3, 'Jetta003', 2, '20:42:17.277063', '20:42:17.277063');
INSERT INTO public.car (id, vin, model_id, update, created) VALUES (4, 'Atlas001', 3, '20:42:17.277063', '20:42:17.277063');
INSERT INTO public.car (id, vin, model_id, update, created) VALUES (5, 'Atlas002', 4, '20:42:17.277063', '20:42:17.277063');
INSERT INTO public.car (id, vin, model_id, update, created) VALUES (1, 'AAA', 2, '20:42:17.277063', '20:42:17.277063');


--
-- TOC entry 2832 (class 0 OID 16412)
-- Dependencies: 198
-- Data for Name: model; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO public.model (id, name, created, updated, "brand-id") VALUES (2, 'Jetta', '2019-04-24 20:29:26.371992', '20:29:26.371992', 1);
INSERT INTO public.model (id, name, created, updated, "brand-id") VALUES (3, 'Pollo', '2019-04-24 20:29:26.371992', '20:29:26.371992', 1);
INSERT INTO public.model (id, name, created, updated, "brand-id") VALUES (4, 'Atlas', '2019-04-24 20:29:26.371992', '20:29:26.371992', 1);
INSERT INTO public.model (id, name, created, updated, "brand-id") VALUES (7, 'sc7', '2019-04-24 20:30:04.164336', '20:30:04.164336', 2);


--
-- TOC entry 2845 (class 0 OID 0)
-- Dependencies: 196
-- Name: brand_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('public.brand_id_seq', 4, true);


--
-- TOC entry 2846 (class 0 OID 0)
-- Dependencies: 201
-- Name: car_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('public.car_id_seq', 5, true);


--
-- TOC entry 2847 (class 0 OID 0)
-- Dependencies: 199
-- Name: model_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('public.model_id_seq', 10, true);


--
-- TOC entry 2694 (class 2606 OID 16442)
-- Name: brand brand_name_key; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.brand
    ADD CONSTRAINT brand_name_key UNIQUE (name);


--
-- TOC entry 2696 (class 2606 OID 16401)
-- Name: brand brand_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.brand
    ADD CONSTRAINT brand_pkey PRIMARY KEY (id);


--
-- TOC entry 2703 (class 2606 OID 16488)
-- Name: car car_id_key; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.car
    ADD CONSTRAINT car_id_key UNIQUE (id);


--
-- TOC entry 2705 (class 2606 OID 16463)
-- Name: car car_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.car
    ADD CONSTRAINT car_pkey PRIMARY KEY (id);


--
-- TOC entry 2699 (class 2606 OID 16452)
-- Name: model model_name_brand-id_key; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.model
    ADD CONSTRAINT "model_name_brand-id_key" UNIQUE (name, "brand-id");


--
-- TOC entry 2701 (class 2606 OID 16450)
-- Name: model model_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.model
    ADD CONSTRAINT model_pkey PRIMARY KEY (id);


--
-- TOC entry 2706 (class 1259 OID 16485)
-- Name: fki_asd; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX fki_asd ON public.car USING btree (model_id);


--
-- TOC entry 2697 (class 1259 OID 16448)
-- Name: fki_fk_de; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX fki_fk_de ON public.model USING btree ("brand-id");


--
-- TOC entry 2708 (class 2606 OID 16480)
-- Name: car car_model_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.car
    ADD CONSTRAINT car_model_id_fkey FOREIGN KEY (model_id) REFERENCES public.model(id);


--
-- TOC entry 2707 (class 2606 OID 16443)
-- Name: model model_brand-id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.model
    ADD CONSTRAINT "model_brand-id_fkey" FOREIGN KEY ("brand-id") REFERENCES public.brand(id);


-- Completed on 2019-04-30 18:55:19

--
-- PostgreSQL database dump complete
--

