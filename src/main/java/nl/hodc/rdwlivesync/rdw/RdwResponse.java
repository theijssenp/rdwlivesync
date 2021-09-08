package nl.hodc.rdwlivesync.rdw;

import java.util.Objects;

import com.fasterxml.jackson.annotation.*;

public class RdwResponse {

    private String kenteken;
    private String voertuigsoort;
    private String merk;
    private String handelsbenaming;
    private String vervaldatumApk;
    private String datumTenaamstelling;
    private String inrichting;
    private String aantalZitplaatsen;
    private String eersteKleur;
    private String tweedeKleur;
    private String brutoBpm;
    private String massaLedigVoertuig;
    private String toegestaneMaximumMassaVoertuig;
    private String massaRijklaar;
    private String datumEersteToelating;
    private String datumEersteAfgifteNederland;
    private String wachtOpKeuren;
    private String catalogusprijs;
    private String wamVerzekerd;
    private String aantalDeuren;
    private String aantalWielen;
    private String afstandHartKoppelingTotAchterzijdeVoertuig;
    private String afstandVoorzijdeVoertuigTotHartKoppeling;
    private String lengte;
    private String breedte;
    private String europeseVoertuigcategorie;
    private String technischeMaxMassaVoertuig;
    private String type;
    private String typegoedkeuringsnummer;
    private String variant;
    private String uitvoering;
    private String volgnummerWijzigingEuTypegoedkeuring;
    private String vermogenMassarijklaar;
    private String wielbasis;
    private String exportIndicator;
    private String openstaandeTerugroepactieIndicator;
    private String taxiIndicator;
    private String maximumMassaSamenstelling;
    private String aantalRolstoelplaatsen;
    private String maximumOndersteunendeSnelheid;
    private String apiGekentekendeVoertuigenAssen;
    private String apiGekentekendeVoertuigenBrandstof;
    private String apiGekentekendeVoertuigenCarrosserie;
    private String apiGekentekendeVoertuigenCarrosserieSpecifiek;
    private String apiGekentekendeVoertuigenVoertuigklasse;
    private String aantalCilinders;
    private String cilinderinhoud;
    private String maximumMassaTrekkenOngeremd;
    private String maximumTrekkenMassaGeremd;
    private String zuinigheidslabel;
    private String plaatsChassisnummer;
    private String europeseVoertuigcategorieToevoeging;
    private String europeseUitvoeringcategorieToevoeging;
    private String typeGasinstallatie;
    private String laadvermogen;
    private String maximaleConstructiesnelheidBromSnorfiets;
    private String vermogenBromSnorfiets;
    private String opleggerGeremd;
    private String vervaldatumTachograaf;
    private String aanhangwagenAutonoomGeremd;
    private String aanhangwagenMiddenasGeremd;
    private String aantalStaanplaatsen;
    private String afwijkendeMaximumSnelheid;
    private String jaarLaatsteRegistratieTellerstand;
    private String tellerstandoordeel;

    @JsonProperty("kenteken")
    public String getKenteken() {
        return kenteken;
    }

    @JsonProperty("kenteken")
    public void setKenteken(String value) {
        this.kenteken = value;
    }

    @JsonProperty("aantal_cilinders")
    public String getAantalCilinders() {
        return aantalCilinders;
    }

    @JsonProperty("aantal_cilinders")
    public void setAantalCilinders(String value) {
        this.aantalCilinders = value;
    }
    
    @JsonProperty("tellerstandoordeel")
    public String getTellerstandoordeel() {
        return tellerstandoordeel;
    }

    @JsonProperty("tellerstandoordeel")
    public void setTellerstandoordeel(String value) {
        this.tellerstandoordeel = value;
    }

    @JsonProperty("afwijkende_maximum_snelheid")
    public String getAfwijkendeMaximumSnelheid() {
        return afwijkendeMaximumSnelheid;
    }

    @JsonProperty("afwijkende_maximum_snelheid")
    public void setAfwijkendeMaximumSnelheid(String value) {
        this.afwijkendeMaximumSnelheid = value;
    }

    @JsonProperty("aantal_staanplaatsen")
    public String getAantalStaanplaatsen() {
        return aantalStaanplaatsen;
    }

    @JsonProperty("aantal_staanplaatsen")
    public void setAantalStaanplaatsen(String value) {
        this.aantalStaanplaatsen = value;
    }

    @JsonProperty("aanhangwagen_middenas_geremd")
    public String getAanhangwagenMiddenasGeremd() {
        return aanhangwagenMiddenasGeremd;
    }

    @JsonProperty("aanhangwagen_middenas_geremd")
    public void setAanhangwagenMiddenasGeremd(String value) {
        this.aanhangwagenMiddenasGeremd = value;
    }

    @JsonProperty("aanhangwagen_autonoom_geremd")
    public String getAanhangwagenAutonoomGeremd() {
        return aanhangwagenAutonoomGeremd;
    }

    @JsonProperty("aanhangwagen_autonoom_geremd")
    public void setAanhangwagenAutonoomGeremd(String value) {
        this.aanhangwagenAutonoomGeremd = value;
    }

    @JsonProperty("vervaldatum_tachograaf")
    public String getVervaldatumTachograaf() {
        return vervaldatumTachograaf;
    }

    @JsonProperty("vervaldatum_tachograaf")
    public void setVervaldatumTachograaf(String value) {
        this.vervaldatumTachograaf = value;
    }

    @JsonProperty("maximale_constructiesnelheid_brom_snorfiets")
    public String getMaximaleConstructiesnelheidBromSnorfiets() {
        return maximaleConstructiesnelheidBromSnorfiets;
    }

    @JsonProperty("maximale_constructiesnelheid_brom_snorfiets")
    public void setMaximaleConstructiesnelheidBromSnorfiets(String value) {
        this.maximaleConstructiesnelheidBromSnorfiets = value;
    }

    @JsonProperty("vermogen_brom_snorfiets")
    public String getVermogenBromSnorfiets() {
        return vermogenBromSnorfiets;
    }

    @JsonProperty("vermogen_brom_snorfiets")
    public void setVermogenBromSnorfiets(String value) {
        this.vermogenBromSnorfiets = value;
    }

    @JsonProperty("oplegger_geremd")
    public String getOpleggerGeremd() {
        return opleggerGeremd;
    }

    @JsonProperty("oplegger_geremd")
    public void setOpleggerGeremd(String value) {
        this.opleggerGeremd = value;
    }

    @JsonProperty("laadvermogen")
    public String getLaadvermogen() {
        return laadvermogen;
    }

    @JsonProperty("laadvermogen")
    public void setLaadvermogen(String value) {
        this.laadvermogen = value;
    }

    @JsonProperty("type_gasinstallatie")
    public String getTypeGasinstallatie() {
        return typeGasinstallatie;
    }

    @JsonProperty("type_gasinstallatie")
    public void setTypeGasinstallatie(String value) {
        this.typeGasinstallatie = value;
    }

    @JsonProperty("europese_uitvoeringcategorie_toevoeging")
    public String getEuropeseUitvoeringcategorieToevoeging() {
        return europeseUitvoeringcategorieToevoeging;
    }

    @JsonProperty("europese_uitvoeringcategorie_toevoeging")
    public void setEuropeseUitvoeringcategorieToevoeging(String value) {
        this.europeseUitvoeringcategorieToevoeging = value;
    }

    @JsonProperty("europese_voertuigcategorie_toevoeging")
    public String getEuropeseVoertuigcategorieToevoeging() {
        return europeseVoertuigcategorieToevoeging;
    }

    @JsonProperty("europese_voertuigcategorie_toevoeging")
    public void setEuropeseVoertuigcategorieToevoeging(String value) {
        this.europeseVoertuigcategorieToevoeging = value;
    }

    @JsonProperty("plaats_chassisnummer")
    public String getPlaatsChassisnummer() {
        return plaatsChassisnummer;
    }

    @JsonProperty("plaats_chassisnummer")
    public void setPlaatsChassisnummer(String value) {
        this.plaatsChassisnummer = value;
    }

    @JsonProperty("maximum_massa_trekken_ongeremd")
    public String getMaximumMassaTrekkenOngeremd() {
        return maximumMassaTrekkenOngeremd;
    }

    @JsonProperty("maximum_massa_trekken_ongeremd")
    public void setMaximumMassaTrekkenOngeremd(String value) {
        this.maximumMassaTrekkenOngeremd = value;
    }

    @JsonProperty("maximum_trekken_massa_geremd")
    public String getMaximumTrekkenMassaGeremd() {
        return maximumTrekkenMassaGeremd;
    }

    @JsonProperty("maximum_trekken_massa_geremd")
    public void setMaximumTrekkenMassaGeremd(String value) {
        this.maximumTrekkenMassaGeremd = value;
    }

    @JsonProperty("zuinigheidslabel")
    public String getZuinigheidslabel() {
        return zuinigheidslabel;
    }

    @JsonProperty("zuinigheidslabel")
    public void setZuinigheidslabel(String value) {
        this.zuinigheidslabel = value;
    }

    @JsonProperty("cilinderinhoud")
    public String getCilinderinhoud() {
        return cilinderinhoud;
    }

    @JsonProperty("cilinderinhoud")
    public void setCilinderinhoud(String value) {
        this.cilinderinhoud = value;
    }

    @JsonProperty("voertuigsoort")
    public String getVoertuigsoort() {
        return voertuigsoort;
    }

    @JsonProperty("voertuigsoort")
    public void setVoertuigsoort(String value) {
        this.voertuigsoort = value;
    }

    @JsonProperty("merk")
    public String getMerk() {
        return merk;
    }

    @JsonProperty("merk")
    public void setMerk(String value) {
        this.merk = value;
    }

    @JsonProperty("handelsbenaming")
    public String getHandelsbenaming() {
        return handelsbenaming;
    }

    @JsonProperty("handelsbenaming")
    public void setHandelsbenaming(String value) {
        this.handelsbenaming = value;
    }

    @JsonProperty("vervaldatum_apk")
    public String getVervaldatumApk() {
        return vervaldatumApk;
    }

    @JsonProperty("vervaldatum_apk")
    public void setVervaldatumApk(String value) {
        this.vervaldatumApk = value;
    }

    @JsonProperty("datum_tenaamstelling")
    public String getDatumTenaamstelling() {
        return datumTenaamstelling;
    }

    @JsonProperty("datum_tenaamstelling")
    public void setDatumTenaamstelling(String value) {
        this.datumTenaamstelling = value;
    }

    @JsonProperty("inrichting")
    public String getInrichting() {
        return inrichting;
    }

    @JsonProperty("inrichting")
    public void setInrichting(String value) {
        this.inrichting = value;
    }

    @JsonProperty("aantal_zitplaatsen")
    public String getAantalZitplaatsen() {
        return aantalZitplaatsen;
    }

    @JsonProperty("aantal_zitplaatsen")
    public void setAantalZitplaatsen(String value) {
        this.aantalZitplaatsen = value;
    }

    @JsonProperty("eerste_kleur")
    public String getEersteKleur() {
        if (eersteKleur == "Niet geregistreerd") {
            return null;
        } else {
            return eersteKleur;
        }

    }

    @JsonProperty("eerste_kleur")
    public void setEersteKleur(String value) {
        this.eersteKleur = value;
    }

    @JsonProperty("tweede_kleur")
    public String getTweedeKleur() {
        if (tweedeKleur == "Niet geregistreerd") {
            return null;
        } else {
            return tweedeKleur;
        }
    }

    @JsonProperty("tweede_kleur")
    public void setTweedeKleur(String value) {
        this.tweedeKleur = value;
    }

    @JsonProperty("bruto_bpm")
    public String getBrutoBpm() {
        return brutoBpm;
    }

    @JsonProperty("bruto_bpm")
    public void setBrutoBpm(String value) {
        this.brutoBpm = value;
    }

    @JsonProperty("massa_ledig_voertuig")
    public String getMassaLedigVoertuig() {
        return massaLedigVoertuig;
    }

    @JsonProperty("massa_ledig_voertuig")
    public void setMassaLedigVoertuig(String value) {
        this.massaLedigVoertuig = value;
    }

    @JsonProperty("toegestane_maximum_massa_voertuig")
    public String getToegestaneMaximumMassaVoertuig() {
        return toegestaneMaximumMassaVoertuig;
    }

    @JsonProperty("toegestane_maximum_massa_voertuig")
    public void setToegestaneMaximumMassaVoertuig(String value) {
        this.toegestaneMaximumMassaVoertuig = value;
    }

    @JsonProperty("massa_rijklaar")
    public String getMassaRijklaar() {
        return massaRijklaar;
    }

    @JsonProperty("massa_rijklaar")
    public void setMassaRijklaar(String value) {
        this.massaRijklaar = value;
    }

    @JsonProperty("datum_eerste_toelating")
    public String getDatumEersteToelating() {
        return datumEersteToelating.substring(6, 8) + "/" + datumEersteToelating.substring(4, 6) + "/"
                + datumEersteToelating.substring(0, 4);
    }

    @JsonProperty("datum_eerste_toelating")
    public void setDatumEersteToelating(String value) {
        this.datumEersteToelating = value;
    }

    @JsonProperty("datum_eerste_afgifte_nederland")
    public String getDatumEersteAfgifteNederland() {
        return datumEersteAfgifteNederland;
    }

    @JsonProperty("datum_eerste_afgifte_nederland")
    public void setDatumEersteAfgifteNederland(String value) {
        this.datumEersteAfgifteNederland = value;
    }

    @JsonProperty("wacht_op_keuren")
    public String getWachtOpKeuren() {
        return wachtOpKeuren;
    }

    @JsonProperty("wacht_op_keuren")
    public void setWachtOpKeuren(String value) {
        this.wachtOpKeuren = value;
    }

    @JsonProperty("catalogusprijs")
    public String getCatalogusprijs() {
        return catalogusprijs;
    }

    @JsonProperty("catalogusprijs")
    public void setCatalogusprijs(String value) {
        this.catalogusprijs = value;
    }

    @JsonProperty("wam_verzekerd")
    public String getWamVerzekerd() {
        return wamVerzekerd;
    }

    @JsonProperty("wam_verzekerd")
    public void setWamVerzekerd(String value) {
        this.wamVerzekerd = value;
    }

    @JsonProperty("aantal_deuren")
    public String getAantalDeuren() {
        return aantalDeuren;
    }

    @JsonProperty("aantal_deuren")
    public void setAantalDeuren(String value) {
        this.aantalDeuren = value;
    }

    @JsonProperty("aantal_wielen")
    public String getAantalWielen() {
        return aantalWielen;
    }

    @JsonProperty("aantal_wielen")
    public void setAantalWielen(String value) {
        this.aantalWielen = value;
    }

    @JsonProperty("afstand_hart_koppeling_tot_achterzijde_voertuig")
    public String getAfstandHartKoppelingTotAchterzijdeVoertuig() {
        return afstandHartKoppelingTotAchterzijdeVoertuig;
    }

    @JsonProperty("afstand_hart_koppeling_tot_achterzijde_voertuig")
    public void setAfstandHartKoppelingTotAchterzijdeVoertuig(String value) {
        this.afstandHartKoppelingTotAchterzijdeVoertuig = value;
    }

    @JsonProperty("afstand_voorzijde_voertuig_tot_hart_koppeling")
    public String getAfstandVoorzijdeVoertuigTotHartKoppeling() {
        return afstandVoorzijdeVoertuigTotHartKoppeling;
    }

    @JsonProperty("afstand_voorzijde_voertuig_tot_hart_koppeling")
    public void setAfstandVoorzijdeVoertuigTotHartKoppeling(String value) {
        this.afstandVoorzijdeVoertuigTotHartKoppeling = value;
    }

    @JsonProperty("lengte")
    public String getLengte() {
        return lengte;
    }

    @JsonProperty("lengte")
    public void setLengte(String value) {
        this.lengte = value;
    }

    @JsonProperty("breedte")
    public String getBreedte() {
        return breedte;
    }

    @JsonProperty("breedte")
    public void setBreedte(String value) {
        this.breedte = value;
    }

    @JsonProperty("europese_voertuigcategorie")
    public String getEuropeseVoertuigcategorie() {
        return europeseVoertuigcategorie;
    }

    @JsonProperty("europese_voertuigcategorie")
    public void setEuropeseVoertuigcategorie(String value) {
        this.europeseVoertuigcategorie = value;
    }

    @JsonProperty("technische_max_massa_voertuig")
    public String getTechnischeMaxMassaVoertuig() {
        return technischeMaxMassaVoertuig;
    }

    @JsonProperty("technische_max_massa_voertuig")
    public void setTechnischeMaxMassaVoertuig(String value) {
        this.technischeMaxMassaVoertuig = value;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String value) {
        this.type = value;
    }

    @JsonProperty("typegoedkeuringsnummer")
    public String getTypegoedkeuringsnummer() {
        return typegoedkeuringsnummer;
    }

    @JsonProperty("typegoedkeuringsnummer")
    public void setTypegoedkeuringsnummer(String value) {
        this.typegoedkeuringsnummer = value;
    }

    @JsonProperty("variant")
    public String getVariant() {
        return variant;
    }

    @JsonProperty("variant")
    public void setVariant(String value) {
        this.variant = value;
    }

    @JsonProperty("uitvoering")
    public String getUitvoering() {
        return uitvoering;
    }

    @JsonProperty("uitvoering")
    public void setUitvoering(String value) {
        this.uitvoering = value;
    }

    @JsonProperty("volgnummer_wijziging_eu_typegoedkeuring")
    public String getVolgnummerWijzigingEuTypegoedkeuring() {
        return volgnummerWijzigingEuTypegoedkeuring;
    }

    @JsonProperty("volgnummer_wijziging_eu_typegoedkeuring")
    public void setVolgnummerWijzigingEuTypegoedkeuring(String value) {
        this.volgnummerWijzigingEuTypegoedkeuring = value;
    }

    @JsonProperty("vermogen_massarijklaar")
    public String getVermogenMassarijklaar() {
        return vermogenMassarijklaar;
    }

    @JsonProperty("vermogen_massarijklaar")
    public void setVermogenMassarijklaar(String value) {
        this.vermogenMassarijklaar = value;
    }

    @JsonProperty("wielbasis")
    public String getWielbasis() {
        return wielbasis;
    }

    @JsonProperty("wielbasis")
    public void setWielbasis(String value) {
        this.wielbasis = value;
    }

    @JsonProperty("export_indicator")
    public String getExportIndicator() {
        return exportIndicator;
    }

    @JsonProperty("export_indicator")
    public void setExportIndicator(String value) {
        this.exportIndicator = value;
    }

    @JsonProperty("openstaande_terugroepactie_indicator")
    public String getOpenstaandeTerugroepactieIndicator() {
        return openstaandeTerugroepactieIndicator;
    }

    @JsonProperty("openstaande_terugroepactie_indicator")
    public void setOpenstaandeTerugroepactieIndicator(String value) {
        this.openstaandeTerugroepactieIndicator = value;
    }

    @JsonProperty("taxi_indicator")
    public String getTaxiIndicator() {
        return taxiIndicator;
    }

    @JsonProperty("taxi_indicator")
    public void setTaxiIndicator(String value) {
        this.taxiIndicator = value;
    }

    @JsonProperty("maximum_massa_samenstelling")
    public String getMaximumMassaSamenstelling() {
        return maximumMassaSamenstelling;
    }

    @JsonProperty("maximum_massa_samenstelling")
    public void setMaximumMassaSamenstelling(String value) {
        this.maximumMassaSamenstelling = value;
    }

    @JsonProperty("aantal_rolstoelplaatsen")
    public String getAantalRolstoelplaatsen() {
        return aantalRolstoelplaatsen;
    }

    @JsonProperty("aantal_rolstoelplaatsen")
    public void setAantalRolstoelplaatsen(String value) {
        this.aantalRolstoelplaatsen = value;
    }

    @JsonProperty("maximum_ondersteunende_snelheid")
    public String getMaximumOndersteunendeSnelheid() {
        return maximumOndersteunendeSnelheid;
    }

    @JsonProperty("maximum_ondersteunende_snelheid")
    public void setMaximumOndersteunendeSnelheid(String value) {
        this.maximumOndersteunendeSnelheid = value;
    }

    @JsonProperty("api_gekentekende_voertuigen_assen")
    public String getAPIGekentekendeVoertuigenAssen() {
        return apiGekentekendeVoertuigenAssen;
    }

    @JsonProperty("api_gekentekende_voertuigen_assen")
    public void setAPIGekentekendeVoertuigenAssen(String value) {
        this.apiGekentekendeVoertuigenAssen = value;
    }

    @JsonProperty("api_gekentekende_voertuigen_brandstof")
    public String getAPIGekentekendeVoertuigenBrandstof() {
        return apiGekentekendeVoertuigenBrandstof;
    }

    @JsonProperty("api_gekentekende_voertuigen_brandstof")
    public void setAPIGekentekendeVoertuigenBrandstof(String value) {
        this.apiGekentekendeVoertuigenBrandstof = value;
    }

    @JsonProperty("api_gekentekende_voertuigen_carrosserie")
    public String getAPIGekentekendeVoertuigenCarrosserie() {
        return apiGekentekendeVoertuigenCarrosserie;
    }

    @JsonProperty("api_gekentekende_voertuigen_carrosserie")
    public void setAPIGekentekendeVoertuigenCarrosserie(String value) {
        this.apiGekentekendeVoertuigenCarrosserie = value;
    }

    @JsonProperty("api_gekentekende_voertuigen_carrosserie_specifiek")
    public String getAPIGekentekendeVoertuigenCarrosserieSpecifiek() {
        return apiGekentekendeVoertuigenCarrosserieSpecifiek;
    }

    @JsonProperty("api_gekentekende_voertuigen_carrosserie_specifiek")
    public void setAPIGekentekendeVoertuigenCarrosserieSpecifiek(String value) {
        this.apiGekentekendeVoertuigenCarrosserieSpecifiek = value;
    }

    @JsonProperty("api_gekentekende_voertuigen_voertuigklasse")
    public String getAPIGekentekendeVoertuigenVoertuigklasse() {
        return apiGekentekendeVoertuigenVoertuigklasse;
    }

    @JsonProperty("api_gekentekende_voertuigen_voertuigklasse")
    public void setAPIGekentekendeVoertuigenVoertuigklasse(String value) {
        this.apiGekentekendeVoertuigenVoertuigklasse = value;
    }

    @JsonProperty("jaar_laatste_registratie_tellerstand")
    public void setJaarLaatsteRegistratieTellerstand(String value) {
        this.jaarLaatsteRegistratieTellerstand = value;
    }

    @JsonProperty("jaar_laatste_registratie_tellerstand")
    public String getJaarLaatsteRegistratieTellerstand() {
        return jaarLaatsteRegistratieTellerstand;
    }

    public RdwResponse() {
    }

    public RdwResponse(String kenteken, String voertuigsoort, String merk, String handelsbenaming,
            String vervaldatumApk, String datumTenaamstelling, String inrichting, String aantalZitplaatsen,
            String eersteKleur, String tweedeKleur, String massaLedigVoertuig, String toegestaneMaximumMassaVoertuig,
            String massaRijklaar, String datumEersteToelating, String datumEersteAfgifteNederland, String wachtOpKeuren,
            String catalogusprijs, String wamVerzekerd, String aantalDeuren, String aantalWielen,
            String afstandHartKoppelingTotAchterzijdeVoertuig, String afstandVoorzijdeVoertuigTotHartKoppeling,
            String lengte, String breedte, String europeseVoertuigcategorie, String technischeMaxMassaVoertuig,
            String type, String typegoedkeuringsnummer, String variant, String uitvoering,
            String volgnummerWijzigingEuTypegoedkeuring, String vermogenMassarijklaar, String wielbasis,
            String exportIndicator, String openstaandeTerugroepactieIndicator, String taxiIndicator,
            String maximumMassaSamenstelling, String aantalRolstoelplaatsen, String maximumOndersteunendeSnelheid,
            String apiGekentekendeVoertuigenAssen, String apiGekentekendeVoertuigenBrandstof,
            String apiGekentekendeVoertuigenCarrosserie, String apiGekentekendeVoertuigenCarrosserieSpecifiek,
            String apiGekentekendeVoertuigenVoertuigklasse) {
        this.kenteken = kenteken;
        this.voertuigsoort = voertuigsoort;
        this.merk = merk;
        this.handelsbenaming = handelsbenaming;
        this.vervaldatumApk = vervaldatumApk;
        this.datumTenaamstelling = datumTenaamstelling;
        this.inrichting = inrichting;
        this.aantalZitplaatsen = aantalZitplaatsen;
        this.eersteKleur = eersteKleur;
        this.tweedeKleur = tweedeKleur;
        this.massaLedigVoertuig = massaLedigVoertuig;
        this.toegestaneMaximumMassaVoertuig = toegestaneMaximumMassaVoertuig;
        this.massaRijklaar = massaRijklaar;
        this.datumEersteToelating = datumEersteToelating;
        this.datumEersteAfgifteNederland = datumEersteAfgifteNederland;
        this.wachtOpKeuren = wachtOpKeuren;
        this.catalogusprijs = catalogusprijs;
        this.wamVerzekerd = wamVerzekerd;
        this.aantalDeuren = aantalDeuren;
        this.aantalWielen = aantalWielen;
        this.afstandHartKoppelingTotAchterzijdeVoertuig = afstandHartKoppelingTotAchterzijdeVoertuig;
        this.afstandVoorzijdeVoertuigTotHartKoppeling = afstandVoorzijdeVoertuigTotHartKoppeling;
        this.lengte = lengte;
        this.breedte = breedte;
        this.europeseVoertuigcategorie = europeseVoertuigcategorie;
        this.technischeMaxMassaVoertuig = technischeMaxMassaVoertuig;
        this.type = type;
        this.typegoedkeuringsnummer = typegoedkeuringsnummer;
        this.variant = variant;
        this.uitvoering = uitvoering;
        this.volgnummerWijzigingEuTypegoedkeuring = volgnummerWijzigingEuTypegoedkeuring;
        this.vermogenMassarijklaar = vermogenMassarijklaar;
        this.wielbasis = wielbasis;
        this.exportIndicator = exportIndicator;
        this.openstaandeTerugroepactieIndicator = openstaandeTerugroepactieIndicator;
        this.taxiIndicator = taxiIndicator;
        this.maximumMassaSamenstelling = maximumMassaSamenstelling;
        this.aantalRolstoelplaatsen = aantalRolstoelplaatsen;
        this.maximumOndersteunendeSnelheid = maximumOndersteunendeSnelheid;
        this.apiGekentekendeVoertuigenAssen = apiGekentekendeVoertuigenAssen;
        this.apiGekentekendeVoertuigenBrandstof = apiGekentekendeVoertuigenBrandstof;
        this.apiGekentekendeVoertuigenCarrosserie = apiGekentekendeVoertuigenCarrosserie;
        this.apiGekentekendeVoertuigenCarrosserieSpecifiek = apiGekentekendeVoertuigenCarrosserieSpecifiek;
        this.apiGekentekendeVoertuigenVoertuigklasse = apiGekentekendeVoertuigenVoertuigklasse;
    }

    public String getApiGekentekendeVoertuigenAssen() {
        return this.apiGekentekendeVoertuigenAssen;
    }

    public void setApiGekentekendeVoertuigenAssen(String apiGekentekendeVoertuigenAssen) {
        this.apiGekentekendeVoertuigenAssen = apiGekentekendeVoertuigenAssen;
    }

    public String getApiGekentekendeVoertuigenBrandstof() {
        return this.apiGekentekendeVoertuigenBrandstof;
    }

    public void setApiGekentekendeVoertuigenBrandstof(String apiGekentekendeVoertuigenBrandstof) {
        this.apiGekentekendeVoertuigenBrandstof = apiGekentekendeVoertuigenBrandstof;
    }

    public String getApiGekentekendeVoertuigenCarrosserie() {
        return this.apiGekentekendeVoertuigenCarrosserie;
    }

    public void setApiGekentekendeVoertuigenCarrosserie(String apiGekentekendeVoertuigenCarrosserie) {
        this.apiGekentekendeVoertuigenCarrosserie = apiGekentekendeVoertuigenCarrosserie;
    }

    public String getApiGekentekendeVoertuigenCarrosserieSpecifiek() {
        return this.apiGekentekendeVoertuigenCarrosserieSpecifiek;
    }

    public void setApiGekentekendeVoertuigenCarrosserieSpecifiek(String apiGekentekendeVoertuigenCarrosserieSpecifiek) {
        this.apiGekentekendeVoertuigenCarrosserieSpecifiek = apiGekentekendeVoertuigenCarrosserieSpecifiek;
    }

    public String getApiGekentekendeVoertuigenVoertuigklasse() {
        return this.apiGekentekendeVoertuigenVoertuigklasse;
    }

    public void setApiGekentekendeVoertuigenVoertuigklasse(String apiGekentekendeVoertuigenVoertuigklasse) {
        this.apiGekentekendeVoertuigenVoertuigklasse = apiGekentekendeVoertuigenVoertuigklasse;
    }

    public RdwResponse kenteken(String kenteken) {
        this.kenteken = kenteken;
        return this;
    }

    public RdwResponse voertuigsoort(String voertuigsoort) {
        this.voertuigsoort = voertuigsoort;
        return this;
    }

    public RdwResponse merk(String merk) {
        this.merk = merk;
        return this;
    }

    public RdwResponse handelsbenaming(String handelsbenaming) {
        this.handelsbenaming = handelsbenaming;
        return this;
    }

    public RdwResponse vervaldatumApk(String vervaldatumApk) {
        this.vervaldatumApk = vervaldatumApk;
        return this;
    }

    public RdwResponse datumTenaamstelling(String datumTenaamstelling) {
        this.datumTenaamstelling = datumTenaamstelling;
        return this;
    }

    public RdwResponse inrichting(String inrichting) {
        this.inrichting = inrichting;
        return this;
    }

    public RdwResponse aantalZitplaatsen(String aantalZitplaatsen) {
        this.aantalZitplaatsen = aantalZitplaatsen;
        return this;
    }

    public RdwResponse eersteKleur(String eersteKleur) {
        this.eersteKleur = eersteKleur;
        return this;
    }

    public RdwResponse tweedeKleur(String tweedeKleur) {
        this.tweedeKleur = tweedeKleur;
        return this;
    }

    public RdwResponse massaLedigVoertuig(String massaLedigVoertuig) {
        this.massaLedigVoertuig = massaLedigVoertuig;
        return this;
    }

    public RdwResponse toegestaneMaximumMassaVoertuig(String toegestaneMaximumMassaVoertuig) {
        this.toegestaneMaximumMassaVoertuig = toegestaneMaximumMassaVoertuig;
        return this;
    }

    public RdwResponse massaRijklaar(String massaRijklaar) {
        this.massaRijklaar = massaRijklaar;
        return this;
    }

    public RdwResponse datumEersteToelating(String datumEersteToelating) {
        this.datumEersteToelating = datumEersteToelating;
        return this;
    }

    public RdwResponse datumEersteAfgifteNederland(String datumEersteAfgifteNederland) {
        this.datumEersteAfgifteNederland = datumEersteAfgifteNederland;
        return this;
    }

    public RdwResponse wachtOpKeuren(String wachtOpKeuren) {
        this.wachtOpKeuren = wachtOpKeuren;
        return this;
    }

    public RdwResponse catalogusprijs(String catalogusprijs) {
        this.catalogusprijs = catalogusprijs;
        return this;
    }

    public RdwResponse wamVerzekerd(String wamVerzekerd) {
        this.wamVerzekerd = wamVerzekerd;
        return this;
    }

    public RdwResponse aantalDeuren(String aantalDeuren) {
        this.aantalDeuren = aantalDeuren;
        return this;
    }

    public RdwResponse aantalWielen(String aantalWielen) {
        this.aantalWielen = aantalWielen;
        return this;
    }

    public RdwResponse afstandHartKoppelingTotAchterzijdeVoertuig(String afstandHartKoppelingTotAchterzijdeVoertuig) {
        this.afstandHartKoppelingTotAchterzijdeVoertuig = afstandHartKoppelingTotAchterzijdeVoertuig;
        return this;
    }

    public RdwResponse afstandVoorzijdeVoertuigTotHartKoppeling(String afstandVoorzijdeVoertuigTotHartKoppeling) {
        this.afstandVoorzijdeVoertuigTotHartKoppeling = afstandVoorzijdeVoertuigTotHartKoppeling;
        return this;
    }

    public RdwResponse lengte(String lengte) {
        this.lengte = lengte;
        return this;
    }

    public RdwResponse breedte(String breedte) {
        this.breedte = breedte;
        return this;
    }

    public RdwResponse europeseVoertuigcategorie(String europeseVoertuigcategorie) {
        this.europeseVoertuigcategorie = europeseVoertuigcategorie;
        return this;
    }

    public RdwResponse technischeMaxMassaVoertuig(String technischeMaxMassaVoertuig) {
        this.technischeMaxMassaVoertuig = technischeMaxMassaVoertuig;
        return this;
    }

    public RdwResponse type(String type) {
        this.type = type;
        return this;
    }

    public RdwResponse typegoedkeuringsnummer(String typegoedkeuringsnummer) {
        this.typegoedkeuringsnummer = typegoedkeuringsnummer;
        return this;
    }

    public RdwResponse variant(String variant) {
        this.variant = variant;
        return this;
    }

    public RdwResponse uitvoering(String uitvoering) {
        this.uitvoering = uitvoering;
        return this;
    }

    public RdwResponse volgnummerWijzigingEuTypegoedkeuring(String volgnummerWijzigingEuTypegoedkeuring) {
        this.volgnummerWijzigingEuTypegoedkeuring = volgnummerWijzigingEuTypegoedkeuring;
        return this;
    }

    public RdwResponse vermogenMassarijklaar(String vermogenMassarijklaar) {
        this.vermogenMassarijklaar = vermogenMassarijklaar;
        return this;
    }

    public RdwResponse wielbasis(String wielbasis) {
        this.wielbasis = wielbasis;
        return this;
    }

    public RdwResponse exportIndicator(String exportIndicator) {
        this.exportIndicator = exportIndicator;
        return this;
    }

    public RdwResponse openstaandeTerugroepactieIndicator(String openstaandeTerugroepactieIndicator) {
        this.openstaandeTerugroepactieIndicator = openstaandeTerugroepactieIndicator;
        return this;
    }

    public RdwResponse taxiIndicator(String taxiIndicator) {
        this.taxiIndicator = taxiIndicator;
        return this;
    }

    public RdwResponse maximumMassaSamenstelling(String maximumMassaSamenstelling) {
        this.maximumMassaSamenstelling = maximumMassaSamenstelling;
        return this;
    }

    public RdwResponse aantalRolstoelplaatsen(String aantalRolstoelplaatsen) {
        this.aantalRolstoelplaatsen = aantalRolstoelplaatsen;
        return this;
    }

    public RdwResponse maximumOndersteunendeSnelheid(String maximumOndersteunendeSnelheid) {
        this.maximumOndersteunendeSnelheid = maximumOndersteunendeSnelheid;
        return this;
    }

    public RdwResponse apiGekentekendeVoertuigenAssen(String apiGekentekendeVoertuigenAssen) {
        this.apiGekentekendeVoertuigenAssen = apiGekentekendeVoertuigenAssen;
        return this;
    }

    public RdwResponse apiGekentekendeVoertuigenBrandstof(String apiGekentekendeVoertuigenBrandstof) {
        this.apiGekentekendeVoertuigenBrandstof = apiGekentekendeVoertuigenBrandstof;
        return this;
    }

    public RdwResponse apiGekentekendeVoertuigenCarrosserie(String apiGekentekendeVoertuigenCarrosserie) {
        this.apiGekentekendeVoertuigenCarrosserie = apiGekentekendeVoertuigenCarrosserie;
        return this;
    }

    public RdwResponse apiGekentekendeVoertuigenCarrosserieSpecifiek(
            String apiGekentekendeVoertuigenCarrosserieSpecifiek) {
        this.apiGekentekendeVoertuigenCarrosserieSpecifiek = apiGekentekendeVoertuigenCarrosserieSpecifiek;
        return this;
    }

    public RdwResponse apiGekentekendeVoertuigenVoertuigklasse(String apiGekentekendeVoertuigenVoertuigklasse) {
        this.apiGekentekendeVoertuigenVoertuigklasse = apiGekentekendeVoertuigenVoertuigklasse;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RdwResponse)) {
            return false;
        }
        RdwResponse rdwResponse = (RdwResponse) o;
        return Objects.equals(kenteken, rdwResponse.kenteken)
                && Objects.equals(voertuigsoort, rdwResponse.voertuigsoort) && Objects.equals(merk, rdwResponse.merk)
                && Objects.equals(handelsbenaming, rdwResponse.handelsbenaming)
                && Objects.equals(vervaldatumApk, rdwResponse.vervaldatumApk)
                && Objects.equals(datumTenaamstelling, rdwResponse.datumTenaamstelling)
                && Objects.equals(inrichting, rdwResponse.inrichting)
                && Objects.equals(aantalZitplaatsen, rdwResponse.aantalZitplaatsen)
                && Objects.equals(eersteKleur, rdwResponse.eersteKleur)
                && Objects.equals(tweedeKleur, rdwResponse.tweedeKleur)
                && Objects.equals(massaLedigVoertuig, rdwResponse.massaLedigVoertuig)
                && Objects.equals(toegestaneMaximumMassaVoertuig, rdwResponse.toegestaneMaximumMassaVoertuig)
                && Objects.equals(massaRijklaar, rdwResponse.massaRijklaar)
                && Objects.equals(datumEersteToelating, rdwResponse.datumEersteToelating)
                && Objects.equals(datumEersteAfgifteNederland, rdwResponse.datumEersteAfgifteNederland)
                && Objects.equals(wachtOpKeuren, rdwResponse.wachtOpKeuren)
                && Objects.equals(catalogusprijs, rdwResponse.catalogusprijs)
                && Objects.equals(wamVerzekerd, rdwResponse.wamVerzekerd)
                && Objects.equals(aantalDeuren, rdwResponse.aantalDeuren)
                && Objects.equals(aantalWielen, rdwResponse.aantalWielen)
                && Objects.equals(afstandHartKoppelingTotAchterzijdeVoertuig,
                        rdwResponse.afstandHartKoppelingTotAchterzijdeVoertuig)
                && Objects.equals(afstandVoorzijdeVoertuigTotHartKoppeling,
                        rdwResponse.afstandVoorzijdeVoertuigTotHartKoppeling)
                && Objects.equals(lengte, rdwResponse.lengte) && Objects.equals(breedte, rdwResponse.breedte)
                && Objects.equals(europeseVoertuigcategorie, rdwResponse.europeseVoertuigcategorie)
                && Objects.equals(technischeMaxMassaVoertuig, rdwResponse.technischeMaxMassaVoertuig)
                && Objects.equals(type, rdwResponse.type)
                && Objects.equals(typegoedkeuringsnummer, rdwResponse.typegoedkeuringsnummer)
                && Objects.equals(variant, rdwResponse.variant) && Objects.equals(uitvoering, rdwResponse.uitvoering)
                && Objects.equals(volgnummerWijzigingEuTypegoedkeuring,
                        rdwResponse.volgnummerWijzigingEuTypegoedkeuring)
                && Objects.equals(vermogenMassarijklaar, rdwResponse.vermogenMassarijklaar)
                && Objects.equals(wielbasis, rdwResponse.wielbasis)
                && Objects.equals(exportIndicator, rdwResponse.exportIndicator)
                && Objects.equals(openstaandeTerugroepactieIndicator, rdwResponse.openstaandeTerugroepactieIndicator)
                && Objects.equals(taxiIndicator, rdwResponse.taxiIndicator)
                && Objects.equals(maximumMassaSamenstelling, rdwResponse.maximumMassaSamenstelling)
                && Objects.equals(aantalRolstoelplaatsen, rdwResponse.aantalRolstoelplaatsen)
                && Objects.equals(maximumOndersteunendeSnelheid, rdwResponse.maximumOndersteunendeSnelheid)
                && Objects.equals(apiGekentekendeVoertuigenAssen, rdwResponse.apiGekentekendeVoertuigenAssen)
                && Objects.equals(apiGekentekendeVoertuigenBrandstof, rdwResponse.apiGekentekendeVoertuigenBrandstof)
                && Objects.equals(apiGekentekendeVoertuigenCarrosserie,
                        rdwResponse.apiGekentekendeVoertuigenCarrosserie)
                && Objects.equals(apiGekentekendeVoertuigenCarrosserieSpecifiek,
                        rdwResponse.apiGekentekendeVoertuigenCarrosserieSpecifiek)
                && Objects.equals(apiGekentekendeVoertuigenVoertuigklasse,
                        rdwResponse.apiGekentekendeVoertuigenVoertuigklasse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kenteken, voertuigsoort, merk, handelsbenaming, vervaldatumApk, datumTenaamstelling,
                inrichting, aantalZitplaatsen, eersteKleur, tweedeKleur, massaLedigVoertuig,
                toegestaneMaximumMassaVoertuig, massaRijklaar, datumEersteToelating, datumEersteAfgifteNederland,
                wachtOpKeuren, catalogusprijs, wamVerzekerd, aantalDeuren, aantalWielen,
                afstandHartKoppelingTotAchterzijdeVoertuig, afstandVoorzijdeVoertuigTotHartKoppeling, lengte, breedte,
                europeseVoertuigcategorie, technischeMaxMassaVoertuig, type, typegoedkeuringsnummer, variant,
                uitvoering, volgnummerWijzigingEuTypegoedkeuring, vermogenMassarijklaar, wielbasis, exportIndicator,
                openstaandeTerugroepactieIndicator, taxiIndicator, maximumMassaSamenstelling, aantalRolstoelplaatsen,
                maximumOndersteunendeSnelheid, apiGekentekendeVoertuigenAssen, apiGekentekendeVoertuigenBrandstof,
                apiGekentekendeVoertuigenCarrosserie, apiGekentekendeVoertuigenCarrosserieSpecifiek,
                apiGekentekendeVoertuigenVoertuigklasse);
    }

    @Override
    public String toString() {
        return "{" + " kenteken='" + getKenteken() + "'" + ", voertuigsoort='" + getVoertuigsoort() + "'" + ", merk='"
                + getMerk() + "'" + ", handelsbenaming='" + getHandelsbenaming() + "'" + ", vervaldatumApk='"
                + getVervaldatumApk() + "'" + ", datumTenaamstelling='" + getDatumTenaamstelling() + "'"
                + ", inrichting='" + getInrichting() + "'" + ", aantalZitplaatsen='" + getAantalZitplaatsen() + "'"
                + ", eersteKleur='" + getEersteKleur() + "'" + ", tweedeKleur='" + getTweedeKleur() + "'"
                + ", massaLedigVoertuig='" + getMassaLedigVoertuig() + "'" + ", toegestaneMaximumMassaVoertuig='"
                + getToegestaneMaximumMassaVoertuig() + "'" + ", massaRijklaar='" + getMassaRijklaar() + "'"
                + ", datumEersteToelating='" + getDatumEersteToelating() + "'" + ", datumEersteAfgifteNederland='"
                + getDatumEersteAfgifteNederland() + "'" + ", wachtOpKeuren='" + getWachtOpKeuren() + "'"
                + ", catalogusprijs='" + getCatalogusprijs() + "'" + ", wamVerzekerd='" + getWamVerzekerd() + "'"
                + ", aantalDeuren='" + getAantalDeuren() + "'" + ", aantalWielen='" + getAantalWielen() + "'"
                + ", afstandHartKoppelingTotAchterzijdeVoertuig='" + getAfstandHartKoppelingTotAchterzijdeVoertuig()
                + "'" + ", afstandVoorzijdeVoertuigTotHartKoppeling='" + getAfstandVoorzijdeVoertuigTotHartKoppeling()
                + "'" + ", lengte='" + getLengte() + "'" + ", breedte='" + getBreedte() + "'"
                + ", europeseVoertuigcategorie='" + getEuropeseVoertuigcategorie() + "'"
                + ", technischeMaxMassaVoertuig='" + getTechnischeMaxMassaVoertuig() + "'" + ", type='" + getType()
                + "'" + ", typegoedkeuringsnummer='" + getTypegoedkeuringsnummer() + "'" + ", variant='" + getVariant()
                + "'" + ", uitvoering='" + getUitvoering() + "'" + ", volgnummerWijzigingEuTypegoedkeuring='"
                + getVolgnummerWijzigingEuTypegoedkeuring() + "'" + ", vermogenMassarijklaar='"
                + getVermogenMassarijklaar() + "'" + ", wielbasis='" + getWielbasis() + "'" + ", exportIndicator='"
                + getExportIndicator() + "'" + ", openstaandeTerugroepactieIndicator='"
                + getOpenstaandeTerugroepactieIndicator() + "'" + ", taxiIndicator='" + getTaxiIndicator() + "'"
                + ", maximumMassaSamenstelling='" + getMaximumMassaSamenstelling() + "'" + ", aantalRolstoelplaatsen='"
                + getAantalRolstoelplaatsen() + "'" + ", maximumOndersteunendeSnelheid='"
                + getMaximumOndersteunendeSnelheid() + "'" + ", apiGekentekendeVoertuigenAssen='"
                + getApiGekentekendeVoertuigenAssen() + "'" + ", apiGekentekendeVoertuigenBrandstof='"
                + getApiGekentekendeVoertuigenBrandstof() + "'" + ", apiGekentekendeVoertuigenCarrosserie='"
                + getApiGekentekendeVoertuigenCarrosserie() + "'" + ", apiGekentekendeVoertuigenCarrosserieSpecifiek='"
                + getApiGekentekendeVoertuigenCarrosserieSpecifiek() + "'"
                + ", apiGekentekendeVoertuigenVoertuigklasse='" + getApiGekentekendeVoertuigenVoertuigklasse() + "'"
                + "}";
    }

    public RdwResponse(String kenteken, String voertuigsoort, String merk, String handelsbenaming,
            String vervaldatumApk, String datumTenaamstelling, String inrichting, String aantalZitplaatsen,
            String eersteKleur, String tweedeKleur, String brutoBpm, String massaLedigVoertuig,
            String toegestaneMaximumMassaVoertuig, String massaRijklaar, String datumEersteToelating,
            String datumEersteAfgifteNederland, String wachtOpKeuren, String catalogusprijs, String wamVerzekerd,
            String aantalDeuren, String aantalWielen, String afstandHartKoppelingTotAchterzijdeVoertuig,
            String afstandVoorzijdeVoertuigTotHartKoppeling, String lengte, String breedte,
            String europeseVoertuigcategorie, String technischeMaxMassaVoertuig, String type,
            String typegoedkeuringsnummer, String variant, String uitvoering,
            String volgnummerWijzigingEuTypegoedkeuring, String vermogenMassarijklaar, String wielbasis,
            String exportIndicator, String openstaandeTerugroepactieIndicator, String taxiIndicator,
            String maximumMassaSamenstelling, String aantalRolstoelplaatsen, String maximumOndersteunendeSnelheid,
            String apiGekentekendeVoertuigenAssen, String apiGekentekendeVoertuigenBrandstof,
            String apiGekentekendeVoertuigenCarrosserie, String apiGekentekendeVoertuigenCarrosserieSpecifiek,
            String apiGekentekendeVoertuigenVoertuigklasse) {
        this.kenteken = kenteken;
        this.voertuigsoort = voertuigsoort;
        this.merk = merk;
        this.handelsbenaming = handelsbenaming;
        this.vervaldatumApk = vervaldatumApk;
        this.datumTenaamstelling = datumTenaamstelling;
        this.inrichting = inrichting;
        this.aantalZitplaatsen = aantalZitplaatsen;
        this.eersteKleur = eersteKleur;
        this.tweedeKleur = tweedeKleur;
        this.brutoBpm = brutoBpm;
        this.massaLedigVoertuig = massaLedigVoertuig;
        this.toegestaneMaximumMassaVoertuig = toegestaneMaximumMassaVoertuig;
        this.massaRijklaar = massaRijklaar;
        this.datumEersteToelating = datumEersteToelating;
        this.datumEersteAfgifteNederland = datumEersteAfgifteNederland;
        this.wachtOpKeuren = wachtOpKeuren;
        this.catalogusprijs = catalogusprijs;
        this.wamVerzekerd = wamVerzekerd;
        this.aantalDeuren = aantalDeuren;
        this.aantalWielen = aantalWielen;
        this.afstandHartKoppelingTotAchterzijdeVoertuig = afstandHartKoppelingTotAchterzijdeVoertuig;
        this.afstandVoorzijdeVoertuigTotHartKoppeling = afstandVoorzijdeVoertuigTotHartKoppeling;
        this.lengte = lengte;
        this.breedte = breedte;
        this.europeseVoertuigcategorie = europeseVoertuigcategorie;
        this.technischeMaxMassaVoertuig = technischeMaxMassaVoertuig;
        this.type = type;
        this.typegoedkeuringsnummer = typegoedkeuringsnummer;
        this.variant = variant;
        this.uitvoering = uitvoering;
        this.volgnummerWijzigingEuTypegoedkeuring = volgnummerWijzigingEuTypegoedkeuring;
        this.vermogenMassarijklaar = vermogenMassarijklaar;
        this.wielbasis = wielbasis;
        this.exportIndicator = exportIndicator;
        this.openstaandeTerugroepactieIndicator = openstaandeTerugroepactieIndicator;
        this.taxiIndicator = taxiIndicator;
        this.maximumMassaSamenstelling = maximumMassaSamenstelling;
        this.aantalRolstoelplaatsen = aantalRolstoelplaatsen;
        this.maximumOndersteunendeSnelheid = maximumOndersteunendeSnelheid;
        this.apiGekentekendeVoertuigenAssen = apiGekentekendeVoertuigenAssen;
        this.apiGekentekendeVoertuigenBrandstof = apiGekentekendeVoertuigenBrandstof;
        this.apiGekentekendeVoertuigenCarrosserie = apiGekentekendeVoertuigenCarrosserie;
        this.apiGekentekendeVoertuigenCarrosserieSpecifiek = apiGekentekendeVoertuigenCarrosserieSpecifiek;
        this.apiGekentekendeVoertuigenVoertuigklasse = apiGekentekendeVoertuigenVoertuigklasse;
    }

}
