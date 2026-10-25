package app.chalo.providers.iconassetprovider;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/providers/iconassetprovider/IconTypeUtils;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IconTypeUtils {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static IconType a(String str) {
        Intrinsics.i(str, "str");
        switch (str.hashCode()) {
            case -2138340475:
                if (str.equals("HOME_TAB_SELECTED")) {
                    return IconType.IC_HOME_SELECTED;
                }
                return null;
            case -2013502600:
                if (str.equals("BMTC_TEXT_LOGO")) {
                    return IconType.BMTC_TEXT_LOGO;
                }
                return null;
            case -1999836059:
                if (str.equals("GMCBL_TEXT_LOGO")) {
                    return IconType.GMCBL_TEXT_LOGO;
                }
                return null;
            case -1872538978:
                if (str.equals("HOME_TAB_UNSELECTED")) {
                    return IconType.IC_HOME_UNSELECTED;
                }
                return null;
            case -1787118061:
                if (str.equals("UNLINK")) {
                    return IconType.IC_UNLINK;
                }
                return null;
            case -1776758523:
                if (str.equals("REGULAR_BUS_HOOK")) {
                    return IconType.IC_REGULAR_BUS_FALLBACK;
                }
                return null;
            case -1384861334:
                if (str.equals("CHALO_BUS_LOGO")) {
                    return IconType.IC_CHALO_BUS_WITH_NO_PADDING;
                }
                return null;
            case -1208077514:
                if (str.equals("RECLINER_SEAT")) {
                    return IconType.IC_RECLINER_SEAT;
                }
                return null;
            case -1120737956:
                if (str.equals("SEARCH_TAB_SELECTED")) {
                    return IconType.IC_SEARCH_ACTIVE;
                }
                return null;
            case -1020398952:
                if (str.equals("CUSTOMER_SUPPORT_PROFILE")) {
                    return IconType.IC_CUSTOMER_SUPPORT_PROFILE;
                }
                return null;
            case -1012585035:
                if (str.equals("PASS_SUCCESS")) {
                    return IconType.PASS_SUCCESS;
                }
                return null;
            case -948493901:
                if (str.equals("CHALO_LOGO_HOME")) {
                    return IconType.CHALO_LOGO_HOME;
                }
                return null;
            case -934085504:
                if (str.equals("PRODUCT_CARD")) {
                    return IconType.IC_PRODUCT_FALLBACK;
                }
                return null;
            case -424159218:
                if (str.equals("ADD_CARD")) {
                    return IconType.IC_ADD_CARD;
                }
                return null;
            case -404871216:
                if (str.equals("BENGALURU_WELCOME_IMAGE")) {
                    return IconType.BENGALURU_WELCOME_IMAGE;
                }
                return null;
            case -381070585:
                if (str.equals("CHANGE_LANGUAGE")) {
                    return IconType.IC_CHANGE_LANGUAGE;
                }
                return null;
            case -288564098:
                if (str.equals("CHALO_TAB_UNSELECTED")) {
                    return IconType.IC_CHALO_BUS_UNSELECTED;
                }
                return null;
            case -257981270:
                if (str.equals("PREMIUM_BUS_HOOK")) {
                    return IconType.IC_CHALO_BUS_FALLBACK;
                }
                return null;
            case -11153470:
                if (str.equals("BUS_STOPS_NEAR_ME")) {
                    return IconType.IC_BUS_STOPS_NEAR_ME;
                }
                return null;
            case 69137:
                if (str.equals("EYE")) {
                    return IconType.IC_EYE;
                }
                return null;
            case 69366:
                if (str.equals("FAQ")) {
                    return IconType.IC_FAQ;
                }
                return null;
            case 79221:
                if (str.equals(CLConstants.CREDTYPE_PIN)) {
                    return IconType.IC_CHANGE_PIN;
                }
                return null;
            case 82295:
                if (str.equals("SOS")) {
                    return IconType.IC_SOS;
                }
                return null;
            case 2508000:
                if (str.equals("RATE")) {
                    return IconType.RATE;
                }
                return null;
            case 63294573:
                if (str.equals("BLOCK")) {
                    return IconType.IC_BLOCK;
                }
                return null;
            case 66975696:
                if (str.equals("FLASH")) {
                    return IconType.IC_FLASH;
                }
                return null;
            case 68614182:
                if (str.equals("HEART")) {
                    return IconType.IC_HEART;
                }
                return null;
            case 138864279:
                if (str.equals("TICKETS_PASSES_BLACK")) {
                    return IconType.IC_ICON_TICKET_BLACK;
                }
                return null;
            case 216439093:
                if (str.equals("ELECTRICITY_BILL")) {
                    return IconType.IC_ELECTRICITY_BILL;
                }
                return null;
            case 270624163:
                if (str.equals("NOTIFICATION_PERMISSION")) {
                    return IconType.IC_NOTIFICATION_TURN_ON;
                }
                return null;
            case 293830857:
                if (str.equals("REGULAR_BUS_HEADER_ICON")) {
                    return IconType.IC_REGULAR_BUS;
                }
                return null;
            case 361629029:
                if (str.equals("CHALO_TAB_SELECTED")) {
                    return IconType.IC_CHALO_BUS_SELECTED;
                }
                return null;
            case 366871474:
                if (str.equals("CHALO_CARD_HOOK")) {
                    return IconType.IC_CHALO_CARD_FALLBACK;
                }
                return null;
            case 379609712:
                if (str.equals("CONTACT_SUPPORT")) {
                    return IconType.CONTACT_SUPPORT;
                }
                return null;
            case 408556937:
                if (str.equals("PROFILE")) {
                    return IconType.ICON_PROFILE;
                }
                return null;
            case 413328297:
                if (str.equals("MY_TICKETS_TAB_UNSELECTED")) {
                    return IconType.IC_MY_TICKETS_UNSELECTED;
                }
                return null;
            case 443770745:
                if (str.equals("PAY_FOR_TICKET")) {
                    return IconType.IC_PAY_FOR_TICKET;
                }
                return null;
            case 448325217:
                if (str.equals("REGULAR_TAB_UNSELECTED")) {
                    return IconType.IC_REGULAR_BUS_UNSELECTED;
                }
                return null;
            case 465020151:
                if (str.equals("PAY_FOR_TICKET_3D")) {
                    return IconType.IC_PAY_FOR_TICKET_3D;
                }
                return null;
            case 478971612:
                if (str.equals("ACTIVATE_CARD")) {
                    return IconType.IC_ACTIVATE_CARD;
                }
                return null;
            case 479314167:
                if (str.equals("TICKETS_PASSES")) {
                    return IconType.ICON_TICKET;
                }
                return null;
            case 579204422:
                if (str.equals("UPDATE_BALANCE")) {
                    return IconType.IC_UPDATE_BALANCE;
                }
                return null;
            case 604922958:
                if (str.equals("CUSTOMER_SUPPORT")) {
                    return IconType.IC_CUSTOMER_SUPPORT_HELP;
                }
                return null;
            case 920738105:
                if (str.equals("CHALO_WALLET")) {
                    return IconType.ICON_CHALO_WALLET;
                }
                return null;
            case 1085905589:
                if (str.equals("SEARCH_TAB_UNSELECTED")) {
                    return IconType.IC_SEARCH_INACTIVE;
                }
                return null;
            case 1291967312:
                if (str.equals("MY_TICKETS_TAB_SELECTED")) {
                    return IconType.IC_MY_TICKETS_SELECTED;
                }
                return null;
            case 1380628735:
                if (str.equals("WALLET_ICON")) {
                    return IconType.WALLET_ICON;
                }
                return null;
            case 1407064270:
                if (str.equals("LOCATION_PIN_COLORED")) {
                    return IconType.IC_LOCATION_PIN_COLORED;
                }
                return null;
            case 1537813512:
                if (str.equals("REGULAR_TAB_SELECTED")) {
                    return IconType.IC_REGULAR_BUS_SELECTED;
                }
                return null;
            case 1644916852:
                if (str.equals("HISTORY")) {
                    return IconType.IC_HISTORY;
                }
                return null;
            case 1793631275:
                if (str.equals("PASS_FAILED")) {
                    return IconType.PASS_UNSUCCESS;
                }
                return null;
            case 1865642983:
                if (str.equals("PASS_ICON")) {
                    return IconType.PASS_ICON;
                }
                return null;
            case 2086868228:
                if (str.equals("CITY_CHANGE")) {
                    return IconType.CITY_CHANGE;
                }
                return null;
            default:
                return null;
        }
    }
}
