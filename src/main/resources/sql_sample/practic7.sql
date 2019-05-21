--
-- PostgreSQL database dump
--

-- Dumped from database version 10.8 (Ubuntu 10.8-0ubuntu0.18.04.1)
-- Dumped by pg_dump version 10.8 (Ubuntu 10.8-0ubuntu0.18.04.1)

-- Started on 2019-05-21 12:51:19 EEST

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 13043)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2957 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_with_oids = false;

--
-- TOC entry 196 (class 1259 OID 16449)
-- Name: brands; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.brands (
    id integer NOT NULL,
    name character varying(50) NOT NULL,
    created timestamp without time zone DEFAULT now() NOT NULL,
    updated timestamp without time zone DEFAULT now() NOT NULL
);


--
-- TOC entry 197 (class 1259 OID 16452)
-- Name: brands_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.brands_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2958 (class 0 OID 0)
-- Dependencies: 197
-- Name: brands_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.brands_id_seq OWNED BY public.brands.id;


--
-- TOC entry 200 (class 1259 OID 16485)
-- Name: cars; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.cars (
    id integer NOT NULL,
    vin character varying(50),
    updated timestamp without time zone DEFAULT now() NOT NULL,
    created timestamp without time zone DEFAULT now() NOT NULL,
    model_id integer NOT NULL
);


--
-- TOC entry 201 (class 1259 OID 16488)
-- Name: cars_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.cars_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2959 (class 0 OID 0)
-- Dependencies: 201
-- Name: cars_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.cars_id_seq OWNED BY public.cars.id;


--
-- TOC entry 198 (class 1259 OID 16468)
-- Name: models; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.models (
    id integer NOT NULL,
    name character varying(50) NOT NULL,
    created timestamp without time zone DEFAULT now() NOT NULL,
    updated timestamp without time zone DEFAULT now() NOT NULL,
    brand_id integer NOT NULL
);


--
-- TOC entry 199 (class 1259 OID 16471)
-- Name: models_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.models_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2960 (class 0 OID 0)
-- Dependencies: 199
-- Name: models_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.models_id_seq OWNED BY public.models.id;


--
-- TOC entry 2800 (class 2604 OID 16454)
-- Name: brands id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.brands ALTER COLUMN id SET DEFAULT nextval('public.brands_id_seq'::regclass);


--
-- TOC entry 2806 (class 2604 OID 16490)
-- Name: cars id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.cars ALTER COLUMN id SET DEFAULT nextval('public.cars_id_seq'::regclass);


--
-- TOC entry 2803 (class 2604 OID 16473)
-- Name: models id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.models ALTER COLUMN id SET DEFAULT nextval('public.models_id_seq'::regclass);


--
-- TOC entry 2944 (class 0 OID 16449)
-- Dependencies: 196
-- Data for Name: brands; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO public.brands (id, name, created, updated) VALUES (1, 'vw', '2019-05-20 18:55:48.853375', '2019-05-20 18:55:48.853375');
INSERT INTO public.brands (id, name, created, updated) VALUES (2, 'ford', '2019-05-20 18:55:57.732423', '2019-05-20 18:55:57.732423');
INSERT INTO public.brands (id, name, created, updated) VALUES (3, 'opel', '2019-05-20 18:56:03.521241', '2019-05-20 18:56:03.521241');
INSERT INTO public.brands (id, name, created, updated) VALUES (4, 'audi', '2019-05-20 19:06:04.777356', '2019-05-20 19:06:04.777356');


--
-- TOC entry 2948 (class 0 OID 16485)
-- Dependencies: 200
-- Data for Name: cars; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO public.cars (id, vin, updated, created, model_id) VALUES (1, 'HGDT65487H', '2019-05-20 20:28:15.571', '2019-05-20 20:26:49.980032', 2);


--
-- TOC entry 2946 (class 0 OID 16468)
-- Dependencies: 198
-- Data for Name: models; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO public.models (id, name, created, updated, brand_id) VALUES (2, 'passat', '2019-05-20 20:04:12.044804', '2019-05-20 20:04:12.044804', 1);
INSERT INTO public.models (id, name, created, updated, brand_id) VALUES (3, 'golf', '2019-05-20 20:13:38.447', '2019-05-20 20:13:38.447', 1);


--
-- TOC entry 2961 (class 0 OID 0)
-- Dependencies: 197
-- Name: brands_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('public.brands_id_seq', 9, true);


--
-- TOC entry 2962 (class 0 OID 0)
-- Dependencies: 201
-- Name: cars_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('public.cars_id_seq', 2, true);


--
-- TOC entry 2963 (class 0 OID 0)
-- Dependencies: 199
-- Name: models_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('public.models_id_seq', 5, true);


--
-- TOC entry 2810 (class 2606 OID 16520)
-- Name: brands brand_uniq_name; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.brands
    ADD CONSTRAINT brand_uniq_name UNIQUE (name);


--
-- TOC entry 2812 (class 2606 OID 16467)
-- Name: brands brands_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.brands
    ADD CONSTRAINT brands_pkey PRIMARY KEY (id);


--
-- TOC entry 2819 (class 2606 OID 16512)
-- Name: cars cars_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.cars
    ADD CONSTRAINT cars_pkey PRIMARY KEY (id);


--
-- TOC entry 2815 (class 2606 OID 16522)
-- Name: models model_uniq_name_brand-id; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.models
    ADD CONSTRAINT "model_uniq_name_brand-id" UNIQUE (name, brand_id);


--
-- TOC entry 2817 (class 2606 OID 16504)
-- Name: models models_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.models
    ADD CONSTRAINT models_pkey PRIMARY KEY (id);


--
-- TOC entry 2820 (class 1259 OID 16518)
-- Name: fki_cars_model-id_fkey; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX "fki_cars_model-id_fkey" ON public.cars USING btree (model_id);


--
-- TOC entry 2813 (class 1259 OID 16510)
-- Name: fki_models_brand-id_fkey; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX "fki_models_brand-id_fkey" ON public.models USING btree (brand_id);


--
-- TOC entry 2822 (class 2606 OID 16513)
-- Name: cars cars_model-id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.cars
    ADD CONSTRAINT "cars_model-id_fkey" FOREIGN KEY (model_id) REFERENCES public.models(id);


--
-- TOC entry 2821 (class 2606 OID 16505)
-- Name: models models_brand-id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.models
    ADD CONSTRAINT "models_brand-id_fkey" FOREIGN KEY (brand_id) REFERENCES public.brands(id);


-- Completed on 2019-05-21 12:51:19 EEST

--
-- PostgreSQL database dump complete
--

