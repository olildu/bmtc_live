package app.chalo.providers.iconassetprovider;

import androidx.compose.runtime.ComposerImplKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.spatial.RectListKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.R;
import com.adjust.sdk.Constants;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.wallet.WalletConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.math.Primes;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/providers/iconassetprovider/IconAssetProviderAndroid;", "Lapp/chalo/providers/iconassetprovider/IconAssetProvider;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IconAssetProviderAndroid implements IconAssetProvider {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8860a;

        static {
            int[] iArr = new int[IconType.values().length];
            try {
                iArr[IconType.AC_BG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconType.ACKNOWLEDGEMENT_PASS_TICKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconType.ACTIVE_PASS_SUMMARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IconType.ADD_TICKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IconType.ADD_TICKET_DISABLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IconType.ALERT_ICON_ORANGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IconType.ALERT_ICON_RED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IconType.ALERT_ROUTESCREEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[IconType.ALERT_SCHEDULER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[IconType.ARROW_DOWN_TRIPPLANNER_DETAILS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[IconType.ARROW_DROP_DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[IconType.ARROW_PICK_ROUTE_SEARCH_LESS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[IconType.ARROW_PICK_ROUTE_SEARCH_MORE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[IconType.ARROW_UP_TRIPPLANNER_DETAILS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[IconType.AUTO_NEARBY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[IconType.AUTO_RELOAD.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[IconType.AUTO_TRIP_PLANNER.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[IconType.AVAILABLE_SELECTED_SEAT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[IconType.BAD_SMILEY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[IconType.BENGALURU_WELCOME_IMAGE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[IconType.BLE_PLACEHOLDER_VALIDATION_SCREEN.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[IconType.BLE_TAP_SYMBOL.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[IconType.BLE_TUT_PLACEHOLDER.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[IconType.BMTC_LOGO.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[IconType.BMTC_TEXT_LOGO.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[IconType.BOOK_RIDE_PRE_BOOKING_NUDGE_CARD.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[IconType.BOOKING_FAILED.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[IconType.BOOKING_UNDER_PROCESS.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[IconType.BRAND_RECEIPT_WATERMARK.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[IconType.BREAKDOWN.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[IconType.BULK_BOOKING_POP_UP.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[IconType.BUILDING.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[IconType.BUS_AND_CITY_BACKGROUND.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[IconType.BUS_NEARBY.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[IconType.BUS_NEARBY_CARD_ITEM_ICON.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[IconType.BUS_NEARBY_SELECTED.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[IconType.BUS_NEARBY_UNSELECTED.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[IconType.BUS_PASS.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[IconType.BUS_SEARCH.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[IconType.BUS_TRIP_PLANNER.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[IconType.BUS_UNIVERSAL_SEARCH.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[IconType.CAB_ACTIVITY_REFRESH.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[IconType.CAB_NEARBY.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[IconType.CAB_TRIP_PLANNER.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[IconType.CARRY_OVER_CONFIRMATION_IMAGE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[IconType.CASH.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[IconType.CHALO_BUS_ICON.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[IconType.CHALO_BUS_INFO_IMAGE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[IconType.CHALO_BUS_LOGO.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[IconType.CHALO_BUS_PLACEHOLDER.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[IconType.CHALO_IC_TIME.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[IconType.CHALO_LINK_OFFER_IMAGE.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[IconType.CHALO_LOGO_APP_UPDATE.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[IconType.CHALO_LOGO_HOME.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[IconType.CHALO_LOGO_LANGUAGE_SCREEN.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[IconType.CHALO_LOGO_WITHOUT_ARROW.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[IconType.CHALO_PAY_ACTIVE.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[IconType.CHALO_PAY_BLOCKED.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[IconType.CHALO_PAY_NOT_ACTIVATE.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[IconType.CHECK_CIRCLE.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[IconType.CITY_CHANGE.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[IconType.CITY_SEARCH_NO_RESULT.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[IconType.CITY_SELECTION_BANNER.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[IconType.COMMUTE_PREFERENCE.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[IconType.CLEAR.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[IconType.CLOSE_LOCATION_SEARCH.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[IconType.CLOSE_NEARBY.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[IconType.CONTACT_SUPPORT.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[IconType.DEBIT_CARD.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[IconType.DISCOUNT_GREEN.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[IconType.END.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[IconType.EXPIRED_PASS_SUMMARY.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[IconType.FADED_DIVIDER_WITH_DIAMOND_LEFT.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[IconType.FADED_DIVIDER_WITH_DIAMOND_RIGHT.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[IconType.FAVORITE_ADD.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[IconType.FAVORITE_ADDED.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[IconType.FAVORITE_HOME.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[IconType.FAVORITE_OVERFLOW.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[IconType.FAVORITE_WORK.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[IconType.FERRY_NEARBY_CARD_ITEM_ICON.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[IconType.FERRY_NEARBY_SELECTED.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[IconType.FERRY_SEARCH.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[IconType.FERRY_TRIP_PLANNER.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[IconType.GMCBL_TEXT_LOGO.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[IconType.GPS_DELAY_WINDOW.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[IconType.GROUP_TICKET_BUS.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[IconType.HAVE_A_DOUBT_EMOJI.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[IconType.IC_ACTIVATE_CARD.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[IconType.IC_ACTIVATION_CHECK.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[IconType.IC_ACTIVATION_HELP.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[IconType.IC_ADD.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[IconType.IC_ADD_CARD.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[IconType.IC_ADD_ORANGE.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[IconType.IC_ADD_TO_HOME.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[IconType.IC_ALARM_CLOCK.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[IconType.IC_ALERT_GREY.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[IconType.IC_ALERT_TRIANGLE.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[IconType.IC_ALERT_TRIANGLE_WITH_REFLECTION.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[IconType.IC_APP_UPDATE.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[IconType.IC_ARROW_BACK.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[IconType.IC_ARROW_BACK_BLACK.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[IconType.IC_ARROW_RIGHT.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[IconType.IC_ARROW_RIGHT_DIRECTION.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[IconType.IC_ARROW_UP.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[IconType.IC_AWESOME.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[IconType.IC_BHOPAL_BCLL_LOGO.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[IconType.IC_BLACK_WARNING.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[IconType.IC_BLOCK.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[IconType.IC_BLOCKED_CARD.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[IconType.IC_BLUETOOTH.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr[IconType.IC_BMTC_LOGO.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr[IconType.IC_BOARDING_MARKER.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr[IconType.IC_BOLT.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr[IconType.IC_BUS.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr[IconType.IC_BUS_ALMOST_BLACK.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr[IconType.IC_BUS_STOP.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr[IconType.IC_BUS_STOPS_NEAR_ME.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr[IconType.IC_BUS_TINTED.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr[IconType.IC_METRO_ALMOST_BLACK.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr[IconType.IC_CALENDAR.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr[IconType.IC_CALENDAR_BLACK.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr[IconType.IC_CALENDAR_MONTH.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr[IconType.IC_CALENDAR_MONTH_BLACK.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr[IconType.IC_CAMERA.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr[IconType.IC_CANCEL.ordinal()] = 125;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr[IconType.IC_CANCEL_IN_BLACK_CIRCLE.ordinal()] = 126;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr[IconType.IC_CARD_INFO.ordinal()] = 127;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr[IconType.IC_CARD_RECHARGE.ordinal()] = 128;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr[IconType.IC_CARD_TAP.ordinal()] = 129;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr[IconType.IC_CHALO_BUS.ordinal()] = 130;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr[IconType.IC_CHALO_BUS_LOGO.ordinal()] = 131;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr[IconType.IC_CHALO_BUS_FALLBACK.ordinal()] = 132;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                iArr[IconType.IC_CHALO_BUS_IMAGE_WITH_SHADOW.ordinal()] = 133;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                iArr[IconType.IC_CHALO_BUS_IMAGE_WITH_SHADOW_WITHOUT_PADDING.ordinal()] = 134;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                iArr[IconType.IC_CHALO_BUS_SELECTED.ordinal()] = 135;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                iArr[IconType.IC_CHALO_BUS_UNSELECTED.ordinal()] = 136;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                iArr[IconType.IC_CHALO_BUS_WITH_NO_PADDING.ordinal()] = 137;
            } catch (NoSuchFieldError unused137) {
            }
            try {
                iArr[IconType.IC_CHALO_CARD.ordinal()] = 138;
            } catch (NoSuchFieldError unused138) {
            }
            try {
                iArr[IconType.IC_CHALO_CARD_ERROR.ordinal()] = 139;
            } catch (NoSuchFieldError unused139) {
            }
            try {
                iArr[IconType.IC_CHALO_CARD_FALLBACK.ordinal()] = 140;
            } catch (NoSuchFieldError unused140) {
            }
            try {
                iArr[IconType.IC_CHALO_PAY_WALLET.ordinal()] = 141;
            } catch (NoSuchFieldError unused141) {
            }
            try {
                iArr[IconType.IC_CHANGE_LANGUAGE.ordinal()] = 142;
            } catch (NoSuchFieldError unused142) {
            }
            try {
                iArr[IconType.IC_CHANGE_PIN.ordinal()] = 143;
            } catch (NoSuchFieldError unused143) {
            }
            try {
                iArr[IconType.IC_CHECK_CIRCLE.ordinal()] = 144;
            } catch (NoSuchFieldError unused144) {
            }
            try {
                iArr[IconType.IC_CHECK_ICON.ordinal()] = 145;
            } catch (NoSuchFieldError unused145) {
            }
            try {
                iArr[IconType.IC_CLOSE.ordinal()] = 146;
            } catch (NoSuchFieldError unused146) {
            }
            try {
                iArr[IconType.IC_CLOSE_ROUNDED.ordinal()] = 147;
            } catch (NoSuchFieldError unused147) {
            }
            try {
                iArr[IconType.IC_COIN.ordinal()] = 148;
            } catch (NoSuchFieldError unused148) {
            }
            try {
                iArr[IconType.IC_CUSTOMER_SUPPORT_HELP.ordinal()] = 149;
            } catch (NoSuchFieldError unused149) {
            }
            try {
                iArr[IconType.IC_CUSTOMER_SUPPORT_PROFILE.ordinal()] = 150;
            } catch (NoSuchFieldError unused150) {
            }
            try {
                iArr[IconType.IC_DAILY_LIMIT.ordinal()] = 151;
            } catch (NoSuchFieldError unused151) {
            }
            try {
                iArr[IconType.IC_DEBOARDING_MARKER.ordinal()] = 152;
            } catch (NoSuchFieldError unused152) {
            }
            try {
                iArr[IconType.IC_DELETE.ordinal()] = 153;
            } catch (NoSuchFieldError unused153) {
            }
            try {
                iArr[IconType.IC_DISCLAIMER.ordinal()] = 154;
            } catch (NoSuchFieldError unused154) {
            }
            try {
                iArr[IconType.IC_DONE.ordinal()] = 155;
            } catch (NoSuchFieldError unused155) {
            }
            try {
                iArr[IconType.IC_DOWNLOAD_ICON.ordinal()] = 156;
            } catch (NoSuchFieldError unused156) {
            }
            try {
                iArr[IconType.IC_DRIVER_FALLBACK.ordinal()] = 157;
            } catch (NoSuchFieldError unused157) {
            }
            try {
                iArr[IconType.IC_EDIT.ordinal()] = 158;
            } catch (NoSuchFieldError unused158) {
            }
            try {
                iArr[IconType.IC_EDIT_BUTTON.ordinal()] = 159;
            } catch (NoSuchFieldError unused159) {
            }
            try {
                iArr[IconType.IC_EDIT_CALENDAR.ordinal()] = 160;
            } catch (NoSuchFieldError unused160) {
            }
            try {
                iArr[IconType.IC_ELECTRICITY_BILL.ordinal()] = 161;
            } catch (NoSuchFieldError unused161) {
            }
            try {
                iArr[IconType.IC_EMPTY_EBILL_PAYMENT_HISTORY.ordinal()] = 162;
            } catch (NoSuchFieldError unused162) {
            }
            try {
                iArr[IconType.IC_EMPTY_STATE.ordinal()] = 163;
            } catch (NoSuchFieldError unused163) {
            }
            try {
                iArr[IconType.IC_ERROR_ALERT.ordinal()] = 164;
            } catch (NoSuchFieldError unused164) {
            }
            try {
                iArr[IconType.IC_ERROR_IMAGE.ordinal()] = 165;
            } catch (NoSuchFieldError unused165) {
            }
            try {
                iArr[IconType.IC_ERROR_RETRY.ordinal()] = 166;
            } catch (NoSuchFieldError unused166) {
            }
            try {
                iArr[IconType.IC_EXPAND_ARROW.ordinal()] = 167;
            } catch (NoSuchFieldError unused167) {
            }
            try {
                iArr[IconType.IC_EXPRESS_INDICATOR.ordinal()] = 168;
            } catch (NoSuchFieldError unused168) {
            }
            try {
                iArr[IconType.IC_EYE.ordinal()] = 169;
            } catch (NoSuchFieldError unused169) {
            }
            try {
                iArr[IconType.IC_FAQ.ordinal()] = 170;
            } catch (NoSuchFieldError unused170) {
            }
            try {
                iArr[IconType.IC_FEEDBACK_RATING_ANGRY.ordinal()] = 171;
            } catch (NoSuchFieldError unused171) {
            }
            try {
                iArr[IconType.IC_FEEDBACK_RATING_DISSATISFIED.ordinal()] = 172;
            } catch (NoSuchFieldError unused172) {
            }
            try {
                iArr[IconType.IC_FEEDBACK_RATING_HIGHLY_SATISFIED.ordinal()] = 173;
            } catch (NoSuchFieldError unused173) {
            }
            try {
                iArr[IconType.IC_FEEDBACK_RATING_NEUTRAL.ordinal()] = 174;
            } catch (NoSuchFieldError unused174) {
            }
            try {
                iArr[IconType.IC_FEEDBACK_RATING_SATISFIED.ordinal()] = 175;
            } catch (NoSuchFieldError unused175) {
            }
            try {
                iArr[IconType.IC_FILTER_SHIFT.ordinal()] = 176;
            } catch (NoSuchFieldError unused176) {
            }
            try {
                iArr[IconType.IC_FLAG_FIJI.ordinal()] = 177;
            } catch (NoSuchFieldError unused177) {
            }
            try {
                iArr[IconType.IC_FLAG_INDIA.ordinal()] = 178;
            } catch (NoSuchFieldError unused178) {
            }
            try {
                iArr[IconType.IC_FLAG_PERU.ordinal()] = 179;
            } catch (NoSuchFieldError unused179) {
            }
            try {
                iArr[IconType.IC_FLAG_PHILIPPINES.ordinal()] = 180;
            } catch (NoSuchFieldError unused180) {
            }
            try {
                iArr[IconType.IC_FLAG_THAILAND.ordinal()] = 181;
            } catch (NoSuchFieldError unused181) {
            }
            try {
                iArr[IconType.IC_FLASH.ordinal()] = 182;
            } catch (NoSuchFieldError unused182) {
            }
            try {
                iArr[IconType.IC_FROM_TO_BOLD.ordinal()] = 183;
            } catch (NoSuchFieldError unused183) {
            }
            try {
                iArr[IconType.IC_FROM_TO_TINTED.ordinal()] = 184;
            } catch (NoSuchFieldError unused184) {
            }
            try {
                iArr[IconType.IC_GENERIC_CHECKOUT_ERROR.ordinal()] = 185;
            } catch (NoSuchFieldError unused185) {
            }
            try {
                iArr[IconType.IC_GIFT_BOX.ordinal()] = 186;
            } catch (NoSuchFieldError unused186) {
            }
            try {
                iArr[IconType.IC_GMCBL_BRANDING_LOGO.ordinal()] = 187;
            } catch (NoSuchFieldError unused187) {
            }
            try {
                iArr[IconType.IC_GREEN_ARROW_WITH_BACKGROUND.ordinal()] = 188;
            } catch (NoSuchFieldError unused188) {
            }
            try {
                iArr[IconType.IC_GREEN_TICK.ordinal()] = 189;
            } catch (NoSuchFieldError unused189) {
            }
            try {
                iArr[IconType.IC_HALF_MOON_BLACK.ordinal()] = 190;
            } catch (NoSuchFieldError unused190) {
            }
            try {
                iArr[IconType.IC_HEART.ordinal()] = 191;
            } catch (NoSuchFieldError unused191) {
            }
            try {
                iArr[IconType.IC_HISTORY.ordinal()] = 192;
            } catch (NoSuchFieldError unused192) {
            }
            try {
                iArr[IconType.IC_HOME_SEARCH.ordinal()] = 193;
            } catch (NoSuchFieldError unused193) {
            }
            try {
                iArr[IconType.IC_HOME_SELECTED.ordinal()] = 194;
            } catch (NoSuchFieldError unused194) {
            }
            try {
                iArr[IconType.IC_HOME_UNSELECTED.ordinal()] = 195;
            } catch (NoSuchFieldError unused195) {
            }
            try {
                iArr[IconType.IC_ICON_TICKET_BLACK.ordinal()] = 196;
            } catch (NoSuchFieldError unused196) {
            }
            try {
                iArr[IconType.IC_ICON_TICKET_WHITE.ordinal()] = 197;
            } catch (NoSuchFieldError unused197) {
            }
            try {
                iArr[IconType.IC_INFO.ordinal()] = 198;
            } catch (NoSuchFieldError unused198) {
            }
            try {
                iArr[IconType.IC_INFO_GREY.ordinal()] = 199;
            } catch (NoSuchFieldError unused199) {
            }
            try {
                iArr[IconType.IC_INFO_GREY_TRIANGLE.ordinal()] = 200;
            } catch (NoSuchFieldError unused200) {
            }
            try {
                iArr[IconType.IC_INFO_I.ordinal()] = 201;
            } catch (NoSuchFieldError unused201) {
            }
            try {
                iArr[IconType.IC_INFO_I_FILLED.ordinal()] = 202;
            } catch (NoSuchFieldError unused202) {
            }
            try {
                iArr[IconType.IC_LOCATION_ORANGE.ordinal()] = 203;
            } catch (NoSuchFieldError unused203) {
            }
            try {
                iArr[IconType.IC_LOCATION_PIN.ordinal()] = 204;
            } catch (NoSuchFieldError unused204) {
            }
            try {
                iArr[IconType.IC_LOCATION_PIN_COLORED.ordinal()] = 205;
            } catch (NoSuchFieldError unused205) {
            }
            try {
                iArr[IconType.IC_LOGIN_NUDGE.ordinal()] = 206;
            } catch (NoSuchFieldError unused206) {
            }
            try {
                iArr[IconType.IC_LOGOUT.ordinal()] = 207;
            } catch (NoSuchFieldError unused207) {
            }
            try {
                iArr[IconType.IC_MESSAGE.ordinal()] = 208;
            } catch (NoSuchFieldError unused208) {
            }
            try {
                iArr[IconType.IC_METRO_LINE.ordinal()] = 209;
            } catch (NoSuchFieldError unused209) {
            }
            try {
                iArr[IconType.IC_MINUS.ordinal()] = 210;
            } catch (NoSuchFieldError unused210) {
            }
            try {
                iArr[IconType.IC_MONEY_STACK.ordinal()] = 211;
            } catch (NoSuchFieldError unused211) {
            }
            try {
                iArr[IconType.IC_MY_LOCATION.ordinal()] = 212;
            } catch (NoSuchFieldError unused212) {
            }
            try {
                iArr[IconType.IC_MY_TICKETS_SELECTED.ordinal()] = 213;
            } catch (NoSuchFieldError unused213) {
            }
            try {
                iArr[IconType.IC_MY_TICKETS_UNSELECTED.ordinal()] = 214;
            } catch (NoSuchFieldError unused214) {
            }
            try {
                iArr[IconType.IC_NEARBY_DEVICES.ordinal()] = 215;
            } catch (NoSuchFieldError unused215) {
            }
            try {
                iArr[IconType.IC_NEXT.ordinal()] = 216;
            } catch (NoSuchFieldError unused216) {
            }
            try {
                iArr[IconType.IC_NO_CARD_TRANSACTIONS.ordinal()] = 217;
            } catch (NoSuchFieldError unused217) {
            }
            try {
                iArr[IconType.IC_NO_CARDS_LINKED.ordinal()] = 218;
            } catch (NoSuchFieldError unused218) {
            }
            try {
                iArr[IconType.IC_NO_PHOTO.ordinal()] = 219;
            } catch (NoSuchFieldError unused219) {
            }
            try {
                iArr[IconType.IC_NO_OD_PAIR.ordinal()] = 220;
            } catch (NoSuchFieldError unused220) {
            }
            try {
                iArr[IconType.IC_NO_QUICK_PAY_TRANSACTIONS.ordinal()] = 221;
            } catch (NoSuchFieldError unused221) {
            }
            try {
                iArr[IconType.IC_NO_SLOTS_AVAILABLE.ordinal()] = 222;
            } catch (NoSuchFieldError unused222) {
            }
            try {
                iArr[IconType.IC_NOTIFICATION_TURN_ON.ordinal()] = 223;
            } catch (NoSuchFieldError unused223) {
            }
            try {
                iArr[IconType.IC_NOTIFICATIONS.ordinal()] = 224;
            } catch (NoSuchFieldError unused224) {
            }
            try {
                iArr[IconType.IC_OFFER.ordinal()] = 225;
            } catch (NoSuchFieldError unused225) {
            }
            try {
                iArr[IconType.IC_OFFERS.ordinal()] = 226;
            } catch (NoSuchFieldError unused226) {
            }
            try {
                iArr[IconType.IC_OFFER_GREEN.ordinal()] = 227;
            } catch (NoSuchFieldError unused227) {
            }
            try {
                iArr[IconType.IC_ORANGE_ARROW_RIGHT.ordinal()] = 228;
            } catch (NoSuchFieldError unused228) {
            }
            try {
                iArr[IconType.IC_ORANGE_CIRCULAR_PLUS.ordinal()] = 229;
            } catch (NoSuchFieldError unused229) {
            }
            try {
                iArr[IconType.IC_ORANGE_TINT_ARROW.ordinal()] = 230;
            } catch (NoSuchFieldError unused230) {
            }
            try {
                iArr[IconType.IC_PASS_ACTIVATION_BACKGROUND_BRUSH.ordinal()] = 231;
            } catch (NoSuchFieldError unused231) {
            }
            try {
                iArr[IconType.IC_PASS_BACKGROUND_BRUSH.ordinal()] = 232;
            } catch (NoSuchFieldError unused232) {
            }
            try {
                iArr[IconType.IC_PAY_FOR_TICKET.ordinal()] = 233;
            } catch (NoSuchFieldError unused233) {
            }
            try {
                iArr[IconType.IC_PAY_FOR_TICKET_3D.ordinal()] = 234;
            } catch (NoSuchFieldError unused234) {
            }
            try {
                iArr[IconType.IC_PHONE.ordinal()] = 235;
            } catch (NoSuchFieldError unused235) {
            }
            try {
                iArr[IconType.IC_PHONE_MSG.ordinal()] = 236;
            } catch (NoSuchFieldError unused236) {
            }
            try {
                iArr[IconType.IC_PREMIUM_PASS.ordinal()] = 237;
            } catch (NoSuchFieldError unused237) {
            }
            try {
                iArr[IconType.IC_PLAYLIST.ordinal()] = 238;
            } catch (NoSuchFieldError unused238) {
            }
            try {
                iArr[IconType.IC_PLUS.ordinal()] = 239;
            } catch (NoSuchFieldError unused239) {
            }
            try {
                iArr[IconType.IC_PREMIUM_PASS_BOOK.ordinal()] = 240;
            } catch (NoSuchFieldError unused240) {
            }
            try {
                iArr[IconType.IC_PREVIOUS.ordinal()] = 241;
            } catch (NoSuchFieldError unused241) {
            }
            try {
                iArr[IconType.IC_PRODUCT_FALLBACK.ordinal()] = 242;
            } catch (NoSuchFieldError unused242) {
            }
            try {
                iArr[IconType.IC_PRODUCT_USE.ordinal()] = 243;
            } catch (NoSuchFieldError unused243) {
            }
            try {
                iArr[IconType.IC_PROFILE.ordinal()] = 244;
            } catch (NoSuchFieldError unused244) {
            }
            try {
                iArr[IconType.IC_PROOF_REJECTION.ordinal()] = 245;
            } catch (NoSuchFieldError unused245) {
            }
            try {
                iArr[IconType.IC_QUICK_VALIDATION.ordinal()] = 246;
            } catch (NoSuchFieldError unused246) {
            }
            try {
                iArr[IconType.IC_RECEIPT.ordinal()] = 247;
            } catch (NoSuchFieldError unused247) {
            }
            try {
                iArr[IconType.IC_RECLINER_SEAT.ordinal()] = 248;
            } catch (NoSuchFieldError unused248) {
            }
            try {
                iArr[IconType.IC_RED_ARROW_WITH_BACKGROUND.ordinal()] = 249;
            } catch (NoSuchFieldError unused249) {
            }
            try {
                iArr[IconType.IC_RED_CROSS.ordinal()] = 250;
            } catch (NoSuchFieldError unused250) {
            }
            try {
                iArr[IconType.IC_REFUND_COMPLETE.ordinal()] = 251;
            } catch (NoSuchFieldError unused251) {
            }
            try {
                iArr[IconType.IC_REGULAR_BUS.ordinal()] = 252;
            } catch (NoSuchFieldError unused252) {
            }
            try {
                iArr[IconType.IC_REGULAR_BUS_FALLBACK.ordinal()] = 253;
            } catch (NoSuchFieldError unused253) {
            }
            try {
                iArr[IconType.IC_REGULAR_BUS_SELECTED.ordinal()] = 254;
            } catch (NoSuchFieldError unused254) {
            }
            try {
                iArr[IconType.IC_REGULAR_BUS_UNSELECTED.ordinal()] = 255;
            } catch (NoSuchFieldError unused255) {
            }
            try {
                iArr[IconType.IC_RELOAD.ordinal()] = 256;
            } catch (NoSuchFieldError unused256) {
            }
            try {
                iArr[IconType.IC_ROLLOVER.ordinal()] = 257;
            } catch (NoSuchFieldError unused257) {
            }
            try {
                iArr[IconType.IC_SCHEDULE.ordinal()] = 258;
            } catch (NoSuchFieldError unused258) {
            }
            try {
                iArr[IconType.IC_SCHEDULE_CLOCK.ordinal()] = 259;
            } catch (NoSuchFieldError unused259) {
            }
            try {
                iArr[IconType.IC_SEARCH_ACTIVE.ordinal()] = 260;
            } catch (NoSuchFieldError unused260) {
            }
            try {
                iArr[IconType.IC_SEARCH_INACTIVE.ordinal()] = 261;
            } catch (NoSuchFieldError unused261) {
            }
            try {
                iArr[IconType.IC_SEAT_BLACK.ordinal()] = 262;
            } catch (NoSuchFieldError unused262) {
            }
            try {
                iArr[IconType.IC_SEAT_ICON.ordinal()] = 263;
            } catch (NoSuchFieldError unused263) {
            }
            try {
                iArr[IconType.IC_SEATS.ordinal()] = 264;
            } catch (NoSuchFieldError unused264) {
            }
            try {
                iArr[IconType.IC_SETTINGS.ordinal()] = 265;
            } catch (NoSuchFieldError unused265) {
            }
            try {
                iArr[IconType.IC_SMS_PERMISSION.ordinal()] = 266;
            } catch (NoSuchFieldError unused266) {
            }
            try {
                iArr[IconType.IC_SOS.ordinal()] = 267;
            } catch (NoSuchFieldError unused267) {
            }
            try {
                iArr[IconType.IC_SPLASH_ARROW.ordinal()] = 268;
            } catch (NoSuchFieldError unused268) {
            }
            try {
                iArr[IconType.IC_STATIC_QR.ordinal()] = 269;
            } catch (NoSuchFieldError unused269) {
            }
            try {
                iArr[IconType.IC_STATUS_REPLAY.ordinal()] = 270;
            } catch (NoSuchFieldError unused270) {
            }
            try {
                iArr[IconType.IC_STOPWATCH.ordinal()] = 271;
            } catch (NoSuchFieldError unused271) {
            }
            try {
                iArr[IconType.IC_STAR.ordinal()] = 272;
            } catch (NoSuchFieldError unused272) {
            }
            try {
                iArr[IconType.IC_STOP_DIRECTION.ordinal()] = 273;
            } catch (NoSuchFieldError unused273) {
            }
            try {
                iArr[IconType.IC_STOP_DIRECTIONS.ordinal()] = 274;
            } catch (NoSuchFieldError unused274) {
            }
            try {
                iArr[IconType.IC_STOP_ICON.ordinal()] = 275;
            } catch (NoSuchFieldError unused275) {
            }
            try {
                iArr[IconType.IC_SUN_ORANGE.ordinal()] = 276;
            } catch (NoSuchFieldError unused276) {
            }
            try {
                iArr[IconType.IC_SUPER_SAVER_RECLAIM_UNSUCCESS.ordinal()] = 277;
            } catch (NoSuchFieldError unused277) {
            }
            try {
                iArr[IconType.IC_SWAP_HORIZONTAL_CIRCLE.ordinal()] = 278;
            } catch (NoSuchFieldError unused278) {
            }
            try {
                iArr[IconType.IC_SYSTEM_RESCHEDULED.ordinal()] = 279;
            } catch (NoSuchFieldError unused279) {
            }
            try {
                iArr[IconType.IC_TICKET.ordinal()] = 280;
            } catch (NoSuchFieldError unused280) {
            }
            try {
                iArr[IconType.IC_TIME.ordinal()] = 281;
            } catch (NoSuchFieldError unused281) {
            }
            try {
                iArr[IconType.IC_TRANSGENDER_SYMBOL.ordinal()] = 282;
            } catch (NoSuchFieldError unused282) {
            }
            try {
                iArr[IconType.IC_TRIP_CANCELLED_ACK.ordinal()] = 283;
            } catch (NoSuchFieldError unused283) {
            }
            try {
                iArr[IconType.IC_TRIP_PLANNER_NO_RESULTS.ordinal()] = 284;
            } catch (NoSuchFieldError unused284) {
            }
            try {
                iArr[IconType.IC_TRUECALLER.ordinal()] = 285;
            } catch (NoSuchFieldError unused285) {
            }
            try {
                iArr[IconType.IC_UNLINK.ordinal()] = 286;
            } catch (NoSuchFieldError unused286) {
            }
            try {
                iArr[IconType.IC_UPDATE_BALANCE.ordinal()] = 287;
            } catch (NoSuchFieldError unused287) {
            }
            try {
                iArr[IconType.IC_USER_CONSENT.ordinal()] = 288;
            } catch (NoSuchFieldError unused288) {
            }
            try {
                iArr[IconType.IC_USER_MALE.ordinal()] = 289;
            } catch (NoSuchFieldError unused289) {
            }
            try {
                iArr[IconType.IC_USER_FEMALE.ordinal()] = 290;
            } catch (NoSuchFieldError unused290) {
            }
            try {
                iArr[IconType.IC_USER_TRANSGENDER.ordinal()] = 291;
            } catch (NoSuchFieldError unused291) {
            }
            try {
                iArr[IconType.IC_VALIDATION_BUS.ordinal()] = 292;
            } catch (NoSuchFieldError unused292) {
            }
            try {
                iArr[IconType.IC_WARNING_IMAGE.ordinal()] = 293;
            } catch (NoSuchFieldError unused293) {
            }
            try {
                iArr[IconType.IC_WATCH_VIDEO.ordinal()] = 294;
            } catch (NoSuchFieldError unused294) {
            }
            try {
                iArr[IconType.ICON_CHALO_WALLET.ordinal()] = 295;
            } catch (NoSuchFieldError unused295) {
            }
            try {
                iArr[IconType.ICON_HELP.ordinal()] = 296;
            } catch (NoSuchFieldError unused296) {
            }
            try {
                iArr[IconType.ICON_PROFILE.ordinal()] = 297;
            } catch (NoSuchFieldError unused297) {
            }
            try {
                iArr[IconType.ICON_TICKET.ordinal()] = 298;
            } catch (NoSuchFieldError unused298) {
            }
            try {
                iArr[IconType.IMG_BLUETOOTH_ENABLE_RATIONALE.ordinal()] = 299;
            } catch (NoSuchFieldError unused299) {
            }
            try {
                iArr[IconType.GURUGRAM_LOGO.ordinal()] = 300;
            } catch (NoSuchFieldError unused300) {
            }
            try {
                iArr[IconType.GURUGRAM_WELCOME_IMAGE.ordinal()] = 301;
            } catch (NoSuchFieldError unused301) {
            }
            try {
                iArr[IconType.INFO_OCCUPANCY.ordinal()] = 302;
            } catch (NoSuchFieldError unused302) {
            }
            try {
                iArr[IconType.INTERNET_FAILURE.ordinal()] = 303;
            } catch (NoSuchFieldError unused303) {
            }
            try {
                iArr[IconType.KSRTC_LOGO.ordinal()] = 304;
            } catch (NoSuchFieldError unused304) {
            }
            try {
                iArr[IconType.KSRTC_WELCOME_IMAGE.ordinal()] = 305;
            } catch (NoSuchFieldError unused305) {
            }
            try {
                iArr[IconType.LANDING_PAGE_PRE_BOOKING_NUDGE_CARD.ordinal()] = 306;
            } catch (NoSuchFieldError unused306) {
            }
            try {
                iArr[IconType.LAZY_PAY.ordinal()] = 307;
            } catch (NoSuchFieldError unused307) {
            }
            try {
                iArr[IconType.LESS_COVERAGE.ordinal()] = 308;
            } catch (NoSuchFieldError unused308) {
            }
            try {
                iArr[IconType.LIVE_BUS.ordinal()] = 309;
            } catch (NoSuchFieldError unused309) {
            }
            try {
                iArr[IconType.LIVE_BUS_DELAYED.ordinal()] = 310;
            } catch (NoSuchFieldError unused310) {
            }
            try {
                iArr[IconType.LIVE_BUS_DIRECTION_DELAYED.ordinal()] = 311;
            } catch (NoSuchFieldError unused311) {
            }
            try {
                iArr[IconType.LIVE_BUS_LIST_DELAYED.ordinal()] = 312;
            } catch (NoSuchFieldError unused312) {
            }
            try {
                iArr[IconType.LIVE_BUS2.ordinal()] = 313;
            } catch (NoSuchFieldError unused313) {
            }
            try {
                iArr[IconType.LIVE_BUS2_DIRECTION.ordinal()] = 314;
            } catch (NoSuchFieldError unused314) {
            }
            try {
                iArr[IconType.LIVE_TRACKING.ordinal()] = 315;
            } catch (NoSuchFieldError unused315) {
            }
            try {
                iArr[IconType.LOCATION_PERMISSION_PLACEHOLDER.ordinal()] = 316;
            } catch (NoSuchFieldError unused316) {
            }
            try {
                iArr[IconType.LOCATION_SEARCH.ordinal()] = 317;
            } catch (NoSuchFieldError unused317) {
            }
            try {
                iArr[IconType.LOCATION_STOP_DETAILS.ordinal()] = 318;
            } catch (NoSuchFieldError unused318) {
            }
            try {
                iArr[IconType.LOCK_CIRCLE.ordinal()] = 319;
            } catch (NoSuchFieldError unused319) {
            }
            try {
                iArr[IconType.LOGO_CHALO.ordinal()] = 320;
            } catch (NoSuchFieldError unused320) {
            }
            try {
                iArr[IconType.MAP_CENTER_PIN.ordinal()] = 321;
            } catch (NoSuchFieldError unused321) {
            }
            try {
                iArr[IconType.MENU_CLOSE.ordinal()] = 322;
            } catch (NoSuchFieldError unused322) {
            }
            try {
                iArr[IconType.METRO_NEARBY.ordinal()] = 323;
            } catch (NoSuchFieldError unused323) {
            }
            try {
                iArr[IconType.METRO_NEARBY_CARD_ITEM_ICON.ordinal()] = 324;
            } catch (NoSuchFieldError unused324) {
            }
            try {
                iArr[IconType.METRO_SEARCH.ordinal()] = 325;
            } catch (NoSuchFieldError unused325) {
            }
            try {
                iArr[IconType.METRO_TRIP_PLANNER.ordinal()] = 326;
            } catch (NoSuchFieldError unused326) {
            }
            try {
                iArr[IconType.METRO_UNIVERSAL_SEARCH.ordinal()] = 327;
            } catch (NoSuchFieldError unused327) {
            }
            try {
                iArr[IconType.METRO_GROUP_TICKET.ordinal()] = 328;
            } catch (NoSuchFieldError unused328) {
            }
            try {
                iArr[IconType.MISSED_TAP_OUT.ordinal()] = 329;
            } catch (NoSuchFieldError unused329) {
            }
            try {
                iArr[IconType.MONORAIL_NEARBY.ordinal()] = 330;
            } catch (NoSuchFieldError unused330) {
            }
            try {
                iArr[IconType.MONORAIL_NEARBY_CARD_ITEM_ICON.ordinal()] = 331;
            } catch (NoSuchFieldError unused331) {
            }
            try {
                iArr[IconType.MONORAIL_SEARCH.ordinal()] = 332;
            } catch (NoSuchFieldError unused332) {
            }
            try {
                iArr[IconType.MONORAIL_TRIP_PLANNER.ordinal()] = 333;
            } catch (NoSuchFieldError unused333) {
            }
            try {
                iArr[IconType.MY_LOCATION_HOMESCREEN.ordinal()] = 334;
            } catch (NoSuchFieldError unused334) {
            }
            try {
                iArr[IconType.NEARBY_DEVICES_PERMISSION_PLACEHOLDER.ordinal()] = 335;
            } catch (NoSuchFieldError unused335) {
            }
            try {
                iArr[IconType.NETBANKING.ordinal()] = 336;
            } catch (NoSuchFieldError unused336) {
            }
            try {
                iArr[IconType.NO_INTERNET_ERROR.ordinal()] = 337;
            } catch (NoSuchFieldError unused337) {
            }
            try {
                iArr[IconType.NO_LIVE_TRACKING.ordinal()] = 338;
            } catch (NoSuchFieldError unused338) {
            }
            try {
                iArr[IconType.OFF_DUTY.ordinal()] = 339;
            } catch (NoSuchFieldError unused339) {
            }
            try {
                iArr[IconType.ONBOARDING_LOCATION_SHARE.ordinal()] = 340;
            } catch (NoSuchFieldError unused340) {
            }
            try {
                iArr[IconType.ONDC_LOGO.ordinal()] = 341;
            } catch (NoSuchFieldError unused341) {
            }
            try {
                iArr[IconType.ORANGE_TICK.ordinal()] = 342;
            } catch (NoSuchFieldError unused342) {
            }
            try {
                iArr[IconType.OUT_OF_SERVICE.ordinal()] = 343;
            } catch (NoSuchFieldError unused343) {
            }
            try {
                iArr[IconType.OVERCROWDED.ordinal()] = 344;
            } catch (NoSuchFieldError unused344) {
            }
            try {
                iArr[IconType.PARTY_EMOJI.ordinal()] = 345;
            } catch (NoSuchFieldError unused345) {
            }
            try {
                iArr[IconType.PARTY_POPPER.ordinal()] = 346;
            } catch (NoSuchFieldError unused346) {
            }
            try {
                iArr[IconType.PASS_ICON.ordinal()] = 347;
            } catch (NoSuchFieldError unused347) {
            }
            try {
                iArr[IconType.PASS_SUCCESS.ordinal()] = 348;
            } catch (NoSuchFieldError unused348) {
            }
            try {
                iArr[IconType.PASS_UNSUCCESS.ordinal()] = 349;
            } catch (NoSuchFieldError unused349) {
            }
            try {
                iArr[IconType.PAY_FOR_TICKET_ICON.ordinal()] = 350;
            } catch (NoSuchFieldError unused350) {
            }
            try {
                iArr[IconType.PAYMENT_OTHER_MODES.ordinal()] = 351;
            } catch (NoSuchFieldError unused351) {
            }
            try {
                iArr[IconType.PB_LANDING_IMAGE_NEW.ordinal()] = 352;
            } catch (NoSuchFieldError unused352) {
            }
            try {
                iArr[IconType.PB_PASS_LANDING_PLACEHOLDER.ordinal()] = 353;
            } catch (NoSuchFieldError unused353) {
            }
            try {
                iArr[IconType.PB_SWAP_ICON.ordinal()] = 354;
            } catch (NoSuchFieldError unused354) {
            }
            try {
                iArr[IconType.PB_TP_BANNER.ordinal()] = 355;
            } catch (NoSuchFieldError unused355) {
            }
            try {
                iArr[IconType.PIC_EDIT.ordinal()] = 356;
            } catch (NoSuchFieldError unused356) {
            }
            try {
                iArr[IconType.PLAY_CIRCLE.ordinal()] = 357;
            } catch (NoSuchFieldError unused357) {
            }
            try {
                iArr[IconType.PREBOOK_RIDES_CARD.ordinal()] = 358;
            } catch (NoSuchFieldError unused358) {
            }
            try {
                iArr[IconType.PREBOOKING_CARD.ordinal()] = 359;
            } catch (NoSuchFieldError unused359) {
            }
            try {
                iArr[IconType.PROFILE_EDIT.ordinal()] = 360;
            } catch (NoSuchFieldError unused360) {
            }
            try {
                iArr[IconType.PROFILE_EMPTY.ordinal()] = 361;
            } catch (NoSuchFieldError unused361) {
            }
            try {
                iArr[IconType.RATE.ordinal()] = 362;
            } catch (NoSuchFieldError unused362) {
            }
            try {
                iArr[IconType.REAL_TIME_INDICATOR_PNG.ordinal()] = 363;
            } catch (NoSuchFieldError unused363) {
            }
            try {
                iArr[IconType.RECENT_TRIP.ordinal()] = 364;
            } catch (NoSuchFieldError unused364) {
            }
            try {
                iArr[IconType.RECHARGE_CHALO_PAY_WALLET_ICON.ordinal()] = 365;
            } catch (NoSuchFieldError unused365) {
            }
            try {
                iArr[IconType.RELOAD.ordinal()] = 366;
            } catch (NoSuchFieldError unused366) {
            }
            try {
                iArr[IconType.REMOVE_TICKET.ordinal()] = 367;
            } catch (NoSuchFieldError unused367) {
            }
            try {
                iArr[IconType.REMOVE_TICKET_DISABLED.ordinal()] = 368;
            } catch (NoSuchFieldError unused368) {
            }
            try {
                iArr[IconType.REPLAY.ordinal()] = 369;
            } catch (NoSuchFieldError unused369) {
            }
            try {
                iArr[IconType.ROUTE_LIST_LIVE_DIRECTION.ordinal()] = 370;
            } catch (NoSuchFieldError unused370) {
            }
            try {
                iArr[IconType.ROUTE_REPORT_PROBLEM.ordinal()] = 371;
            } catch (NoSuchFieldError unused371) {
            }
            try {
                iArr[IconType.ROUTE_SCREEN_MENU.ordinal()] = 372;
            } catch (NoSuchFieldError unused372) {
            }
            try {
                iArr[IconType.SAMPLE_CARD_RECEIPT.ordinal()] = 373;
            } catch (NoSuchFieldError unused373) {
            }
            try {
                iArr[IconType.SEARCH.ordinal()] = 374;
            } catch (NoSuchFieldError unused374) {
            }
            try {
                iArr[IconType.SEARCH_BLACK.ordinal()] = 375;
            } catch (NoSuchFieldError unused375) {
            }
            try {
                iArr[IconType.SEATS_AVAILABLE.ordinal()] = 376;
            } catch (NoSuchFieldError unused376) {
            }
            try {
                iArr[IconType.SELECTED_LANG.ordinal()] = 377;
            } catch (NoSuchFieldError unused377) {
            }
            try {
                iArr[IconType.SOLD_OUT_SEAT.ordinal()] = 378;
            } catch (NoSuchFieldError unused378) {
            }
            try {
                iArr[IconType.SOS.ordinal()] = 379;
            } catch (NoSuchFieldError unused379) {
            }
            try {
                iArr[IconType.STANDING_AVAILABLE.ordinal()] = 380;
            } catch (NoSuchFieldError unused380) {
            }
            try {
                iArr[IconType.STAR_OUTLINE.ordinal()] = 381;
            } catch (NoSuchFieldError unused381) {
            }
            try {
                iArr[IconType.STAR_WITH_BLACK_BACKGROUND.ordinal()] = 382;
            } catch (NoSuchFieldError unused382) {
            }
            try {
                iArr[IconType.START.ordinal()] = 383;
            } catch (NoSuchFieldError unused383) {
            }
            try {
                iArr[IconType.STEERING_WHEEL.ordinal()] = 384;
            } catch (NoSuchFieldError unused384) {
            }
            try {
                iArr[IconType.STOP_MARKER_ROUTE_DETAILS.ordinal()] = 385;
            } catch (NoSuchFieldError unused385) {
            }
            try {
                iArr[IconType.STOP_MARKER_ROUTE_DETAILS_DISABLED.ordinal()] = 386;
            } catch (NoSuchFieldError unused386) {
            }
            try {
                iArr[IconType.STOPS_LESS.ordinal()] = 387;
            } catch (NoSuchFieldError unused387) {
            }
            try {
                iArr[IconType.SWAP_PLANNER.ordinal()] = 388;
            } catch (NoSuchFieldError unused388) {
            }
            try {
                iArr[IconType.SWIPE_RIGHT.ordinal()] = 389;
            } catch (NoSuchFieldError unused389) {
            }
            try {
                iArr[IconType.TAP_INDICATOR.ordinal()] = 390;
            } catch (NoSuchFieldError unused390) {
            }
            try {
                iArr[IconType.THUMB.ordinal()] = 391;
            } catch (NoSuchFieldError unused391) {
            }
            try {
                iArr[IconType.THUMBS_UP_BLACK.ordinal()] = 392;
            } catch (NoSuchFieldError unused392) {
            }
            try {
                iArr[IconType.TICKET_PUNCH_SUCCESS.ordinal()] = 393;
            } catch (NoSuchFieldError unused393) {
            }
            try {
                iArr[IconType.TRAFFIC.ordinal()] = 394;
            } catch (NoSuchFieldError unused394) {
            }
            try {
                iArr[IconType.TRAFFIC_SIGNAL.ordinal()] = 395;
            } catch (NoSuchFieldError unused395) {
            }
            try {
                iArr[IconType.TRAIN_HOMESCREEN.ordinal()] = 396;
            } catch (NoSuchFieldError unused396) {
            }
            try {
                iArr[IconType.TRAIN_NEARBY.ordinal()] = 397;
            } catch (NoSuchFieldError unused397) {
            }
            try {
                iArr[IconType.TRAIN_NEARBY_CARD_ITEM_ICON.ordinal()] = 398;
            } catch (NoSuchFieldError unused398) {
            }
            try {
                iArr[IconType.TRAIN_SEARCH.ordinal()] = 399;
            } catch (NoSuchFieldError unused399) {
            }
            try {
                iArr[IconType.TRAIN_TRIP_PLANNER.ordinal()] = 400;
            } catch (NoSuchFieldError unused400) {
            }
            try {
                iArr[IconType.UNIVERSAL_NO_RESULTS_FOUND.ordinal()] = 401;
            } catch (NoSuchFieldError unused401) {
            }
            try {
                iArr[IconType.UNSELECTED_AVAILABLE_SEAT.ordinal()] = 402;
            } catch (NoSuchFieldError unused402) {
            }
            try {
                iArr[IconType.UNSUPPORTED_CITY.ordinal()] = 403;
            } catch (NoSuchFieldError unused403) {
            }
            try {
                iArr[IconType.UPI.ordinal()] = 404;
            } catch (NoSuchFieldError unused404) {
            }
            try {
                iArr[IconType.UPI_EMPTY.ordinal()] = 405;
            } catch (NoSuchFieldError unused405) {
            }
            try {
                iArr[IconType.USER_PROFILE_CONFETTI.ordinal()] = 406;
            } catch (NoSuchFieldError unused406) {
            }
            try {
                iArr[IconType.VERIFICATION_SUBMISSION.ordinal()] = 407;
            } catch (NoSuchFieldError unused407) {
            }
            try {
                iArr[IconType.WALK_NEARBY.ordinal()] = 408;
            } catch (NoSuchFieldError unused408) {
            }
            try {
                iArr[IconType.WALK_NEARBYCARD_BLACK.ordinal()] = 409;
            } catch (NoSuchFieldError unused409) {
            }
            try {
                iArr[IconType.WALK_TRIP_PLANNER.ordinal()] = 410;
            } catch (NoSuchFieldError unused410) {
            }
            try {
                iArr[IconType.WALLET_AUTO_RECLAIM_PROGRESS.ordinal()] = 411;
            } catch (NoSuchFieldError unused411) {
            }
            try {
                iArr[IconType.WALLET_AUTO_RECLAIM_ERROR.ordinal()] = 412;
            } catch (NoSuchFieldError unused412) {
            }
            try {
                iArr[IconType.WALLET_ICON.ordinal()] = 413;
            } catch (NoSuchFieldError unused413) {
            }
            try {
                iArr[IconType.WALLET_ICON_WITH_GREEN_DOLLAR.ordinal()] = 414;
            } catch (NoSuchFieldError unused414) {
            }
            try {
                iArr[IconType.WALLET_INTRODUCTION.ordinal()] = 415;
            } catch (NoSuchFieldError unused415) {
            }
            try {
                iArr[IconType.WALLET_MENU_ICON.ordinal()] = 416;
            } catch (NoSuchFieldError unused416) {
            }
            try {
                iArr[IconType.WALLET_NOT_ACTIVATED.ordinal()] = 417;
            } catch (NoSuchFieldError unused417) {
            }
            try {
                iArr[IconType.WALLET_RESIZED.ordinal()] = 418;
            } catch (NoSuchFieldError unused418) {
            }
            try {
                iArr[IconType.WALLET_TRANSACTION_FAILED.ordinal()] = 419;
            } catch (NoSuchFieldError unused419) {
            }
            try {
                iArr[IconType.WALLET_TRANSACTION_PENDING.ordinal()] = 420;
            } catch (NoSuchFieldError unused420) {
            }
            try {
                iArr[IconType.WALLET_TRANSACTION_SUCCESS.ordinal()] = 421;
            } catch (NoSuchFieldError unused421) {
            }
            try {
                iArr[IconType.WOMEN_SELECTED_SEAT.ordinal()] = 422;
            } catch (NoSuchFieldError unused422) {
            }
            try {
                iArr[IconType.WOMEN_UNAVAILABLE_SEAT.ordinal()] = 423;
            } catch (NoSuchFieldError unused423) {
            }
            try {
                iArr[IconType.WOMEN_UNSELECTED_SEAT.ordinal()] = 424;
            } catch (NoSuchFieldError unused424) {
            }
            try {
                iArr[IconType.WEATHER.ordinal()] = 425;
            } catch (NoSuchFieldError unused425) {
            }
            try {
                iArr[IconType.YES_BANK.ordinal()] = 426;
            } catch (NoSuchFieldError unused426) {
            }
            f8860a = iArr;
        }
    }

    @Override // app.chalo.providers.iconassetprovider.IconAssetProvider
    public final IconAsset a(IconType iconType) {
        Intrinsics.i(iconType, "iconType");
        Integer numValueOf = null;
        switch (WhenMappings.f8860a[iconType.ordinal()]) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 31:
            case 32:
            case 37:
            case 38:
            case 41:
            case 42:
            case 44:
            case 45:
            case 48:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
            case 56:
            case 60:
            case RectListKt.BitOffsetForGesturable /* 62 */:
            case 63:
            case 64:
            case 66:
            case EACTags.APPLICATION_IMAGE /* 68 */:
            case 70:
            case 72:
            case 73:
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
            case EACTags.DEPRECATED /* 75 */:
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
            case 79:
            case 83:
            case 84:
            case 86:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 90:
            case 91:
            case 93:
            case 94:
            case 95:
            case 97:
            case 98:
            case 102:
            case 103:
            case 105:
            case 106:
            case 107:
            case 109:
            case FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD /* 110 */:
            case FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION /* 111 */:
            case 113:
            case 114:
            case 115:
            case 119:
            case 120:
            case 122:
            case 123:
            case 124:
            case ComposerImplKt.nodeKey /* 125 */:
            case 127:
            case 128:
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
            case 131:
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
            case TsExtractor.TS_STREAM_TYPE_DTS_UHD /* 139 */:
            case 140:
            case 144:
            case 145:
            case 147:
            case 148:
            case 153:
            case 154:
            case 155:
            case 156:
            case 158:
            case 159:
            case 160:
            case 162:
            case 163:
            case 165:
            case 166:
            case 167:
            case 168:
            case 176:
            case 183:
            case 187:
            case 188:
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
            case 190:
            case 197:
            case 198:
            case 199:
            case ComposerKt.compositionLocalMapKey /* 202 */:
            case ComposerKt.providerValuesKey /* 203 */:
            case ComposerKt.referenceKey /* 206 */:
            case ComposerKt.reuseKey /* 207 */:
            case 209:
            case 210:
            case Primes.SMALL_FACTOR_LIMIT /* 211 */:
            case 212:
            case 215:
            case 217:
            case 218:
            case 219:
            case 222:
            case 224:
            case 225:
            case 226:
            case 227:
            case 228:
            case 231:
            case 232:
            case 235:
            case 237:
            case 238:
            case 239:
            case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
            case 243:
            case 245:
            case 246:
            case 247:
            case 249:
            case 250:
            case 251:
            case 256:
            case 257:
            case 258:
            case 259:
            case 264:
            case 265:
            case 266:
            case 268:
            case 269:
            case 270:
            case 271:
            case 272:
            case 273:
            case 276:
            case 277:
            case 278:
            case 281:
            case 282:
            case 284:
            case 287:
            case 289:
            case 290:
            case 291:
            case 292:
            case 293:
            case 294:
            case 299:
            case 300:
            case 301:
            case 304:
            case 305:
            case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
            case TypedValues.AttributesType.TYPE_PIVOT_TARGET /* 318 */:
            case 319:
            case 322:
            case 326:
            case 327:
            case 328:
            case 329:
            case 333:
            case 335:
            case 340:
            case 342:
            case 343:
            case 345:
            case 346:
            case 347:
            case 350:
            case 351:
            case 352:
            case 353:
            case 354:
            case 355:
            case 357:
            case 358:
            case 359:
            case 364:
            case 366:
            case 367:
            case 368:
            case 373:
            case 375:
            case 377:
            case 378:
            case 379:
            case 381:
            case 382:
            case 384:
            case 387:
            case 388:
            case 389:
            case 390:
            case 392:
            case Constants.MINIMAL_ERROR_STATUS_CODE /* 400 */:
            case TypedValues.CycleType.TYPE_CURVE_FIT /* 401 */:
            case 402:
            case TypedValues.CycleType.TYPE_ALPHA /* 403 */:
            case WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED /* 406 */:
            case 407:
            case WalletConstants.ERROR_CODE_INVALID_TRANSACTION /* 410 */:
            case WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE /* 411 */:
            case WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION /* 412 */:
            case WalletConstants.ERROR_CODE_UNKNOWN /* 413 */:
            case WalletConstants.ERROR_CODE_ILLEGAL_CALLER /* 414 */:
            case 416:
            case TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE /* 422 */:
            case TypedValues.CycleType.TYPE_WAVE_PERIOD /* 423 */:
            case TypedValues.CycleType.TYPE_WAVE_OFFSET /* 424 */:
                break;
            case 2:
                numValueOf = Integer.valueOf(R.drawable.acknowledgement_pass_ticket);
                break;
            case 4:
                numValueOf = Integer.valueOf(R.drawable.add_ticket);
                break;
            case 6:
                numValueOf = Integer.valueOf(R.drawable.alert_icon_orange);
                break;
            case 8:
                numValueOf = Integer.valueOf(R.drawable.alert_routescreen);
                break;
            case 11:
                numValueOf = Integer.valueOf(R.drawable.arrow_drop_down);
                break;
            case 15:
                numValueOf = Integer.valueOf(R.drawable.auto_nearby);
                break;
            case 17:
                numValueOf = Integer.valueOf(R.drawable.auto_trip_planner);
                break;
            case 19:
                numValueOf = Integer.valueOf(R.drawable.bad_smiley);
                break;
            case 21:
                numValueOf = Integer.valueOf(R.drawable.ble_placeholder_validation_screen);
                break;
            case 23:
                numValueOf = Integer.valueOf(R.drawable.ble_tut_placeholder);
                break;
            case 30:
                numValueOf = Integer.valueOf(R.drawable.breakdown);
                break;
            case 33:
                numValueOf = Integer.valueOf(R.drawable.bus_and_city_background);
                break;
            case 34:
                numValueOf = Integer.valueOf(R.drawable.bus_nearby);
                break;
            case 35:
                numValueOf = Integer.valueOf(R.drawable.bus_nearby_card_item_icon);
                break;
            case 36:
                numValueOf = Integer.valueOf(R.drawable.bus_nearby_selected);
                break;
            case 39:
                numValueOf = Integer.valueOf(R.drawable.bus_search);
                break;
            case 40:
                numValueOf = Integer.valueOf(R.drawable.bus_trip_planner);
                break;
            case 43:
                numValueOf = Integer.valueOf(R.drawable.cab_nearby);
                break;
            case 46:
                numValueOf = Integer.valueOf(R.drawable.cash);
                break;
            case 47:
                numValueOf = Integer.valueOf(R.drawable.chalo_bus_icon);
                break;
            case 54:
                numValueOf = Integer.valueOf(R.drawable.chalo_logo_home);
                break;
            case 55:
                numValueOf = Integer.valueOf(R.drawable.chalo_logo_language_screen);
                break;
            case 57:
                numValueOf = Integer.valueOf(R.drawable.chalo_pay_active);
                break;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                numValueOf = Integer.valueOf(R.drawable.chalo_pay_blocked);
                break;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                numValueOf = Integer.valueOf(R.drawable.chalo_pay_not_activate);
                break;
            case 61:
                numValueOf = Integer.valueOf(R.drawable.city_change);
                break;
            case 65:
                numValueOf = Integer.valueOf(R.drawable.clear);
                break;
            case 67:
                numValueOf = Integer.valueOf(R.drawable.close_nearby);
                break;
            case EACTags.DISPLAY_IMAGE /* 69 */:
                numValueOf = Integer.valueOf(R.drawable.debit_card);
                break;
            case 71:
                numValueOf = Integer.valueOf(R.drawable.end);
                break;
            case 76:
                numValueOf = Integer.valueOf(R.drawable.favorite_added);
                break;
            case 78:
                numValueOf = Integer.valueOf(R.drawable.favorite_overflow);
                break;
            case 80:
                numValueOf = Integer.valueOf(R.drawable.ferry_nearby_card_item_icon);
                break;
            case EACTags.ANSWER_TO_RESET /* 81 */:
                numValueOf = Integer.valueOf(R.drawable.ferry_nearby_selected);
                break;
            case EACTags.HISTORICAL_BYTES /* 82 */:
                numValueOf = Integer.valueOf(R.drawable.ferry_search);
                break;
            case 85:
                numValueOf = Integer.valueOf(R.drawable.gps_delay_window);
                break;
            case 87:
                numValueOf = Integer.valueOf(R.drawable.have_a_doubt_emoji);
                break;
            case 88:
                numValueOf = Integer.valueOf(R.drawable.ic_activate_card);
                break;
            case 92:
                numValueOf = Integer.valueOf(R.drawable.ic_add_card);
                break;
            case 96:
                numValueOf = Integer.valueOf(R.drawable.ic_alert_grey);
                break;
            case 99:
                numValueOf = Integer.valueOf(R.drawable.ic_app_update);
                break;
            case 100:
                numValueOf = Integer.valueOf(R.drawable.ic_arrow_back);
                break;
            case 101:
                numValueOf = Integer.valueOf(R.drawable.ic_arrow_back_black_24dp);
                break;
            case 104:
                numValueOf = Integer.valueOf(R.drawable.ic_arrow_up);
                break;
            case 108:
                numValueOf = Integer.valueOf(R.drawable.ic_block);
                break;
            case 112:
                numValueOf = Integer.valueOf(R.drawable.boarding_marker);
                break;
            case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                numValueOf = Integer.valueOf(R.drawable.ic_bus_stop);
                break;
            case 117:
                numValueOf = Integer.valueOf(R.drawable.ic_bus_stops_near_me);
                break;
            case 118:
                numValueOf = Integer.valueOf(R.drawable.ic_bus_tinted);
                break;
            case 121:
                numValueOf = Integer.valueOf(R.drawable.ic_calendar_black);
                break;
            case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                numValueOf = Integer.valueOf(R.drawable.ic_cancel_in_black_circle);
                break;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                numValueOf = Integer.valueOf(R.drawable.ic_chalo_bus);
                break;
            case 132:
                numValueOf = Integer.valueOf(R.drawable.ic_chalo_bus_fallback);
                break;
            case 133:
                numValueOf = Integer.valueOf(R.drawable.ic_chalo_bus_image_with_shadow);
                break;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                numValueOf = Integer.valueOf(R.drawable.ic_chalo_bus_image_with_shadow_without_padding);
                break;
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                numValueOf = Integer.valueOf(R.drawable.ic_chalo_bus_selected);
                break;
            case TsExtractor.TS_STREAM_TYPE_DTS_HD /* 136 */:
                numValueOf = Integer.valueOf(R.drawable.ic_chalo_bus_unselected);
                break;
            case 137:
                numValueOf = Integer.valueOf(R.drawable.ic_chalo_bus_with_no_padding);
                break;
            case 141:
                numValueOf = Integer.valueOf(R.drawable.ic_chalo_pay_wallet);
                break;
            case 142:
                numValueOf = Integer.valueOf(R.drawable.ic_change_language);
                break;
            case 143:
                numValueOf = Integer.valueOf(R.drawable.ic_change_pin);
                break;
            case 146:
                numValueOf = Integer.valueOf(R.drawable.ic_close);
                break;
            case 149:
                numValueOf = Integer.valueOf(R.drawable.ic_customer_support_help);
                break;
            case 150:
                numValueOf = Integer.valueOf(R.drawable.ic_customer_support_profile);
                break;
            case 151:
                numValueOf = Integer.valueOf(R.drawable.ic_daily_limit);
                break;
            case 152:
                numValueOf = Integer.valueOf(R.drawable.deboarding_marker);
                break;
            case 157:
                numValueOf = Integer.valueOf(R.drawable.ic_driver_fallback);
                break;
            case 161:
                numValueOf = Integer.valueOf(R.drawable.ic_electricity_bill);
                break;
            case 164:
                numValueOf = Integer.valueOf(R.drawable.ic_error_alert);
                break;
            case 169:
                numValueOf = Integer.valueOf(R.drawable.ic_eye);
                break;
            case 170:
                numValueOf = Integer.valueOf(R.drawable.ic_faq);
                break;
            case 171:
                numValueOf = Integer.valueOf(R.drawable.ic_feedback_rating_angry);
                break;
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                numValueOf = Integer.valueOf(R.drawable.ic_feedback_rating_dissatisfied);
                break;
            case 173:
                numValueOf = Integer.valueOf(R.drawable.ic_feedback_rating_highly_satisfied);
                break;
            case 174:
                numValueOf = Integer.valueOf(R.drawable.ic_feedback_rating_neutral);
                break;
            case 175:
                numValueOf = Integer.valueOf(R.drawable.ic_feedback_rating_satisfied);
                break;
            case 177:
                numValueOf = Integer.valueOf(R.drawable.ic_flag_fiji);
                break;
            case 178:
                numValueOf = Integer.valueOf(R.drawable.ic_flag_india);
                break;
            case 179:
                numValueOf = Integer.valueOf(R.drawable.ic_flag_peru);
                break;
            case 180:
                numValueOf = Integer.valueOf(R.drawable.ic_flag_philippines);
                break;
            case 181:
                numValueOf = Integer.valueOf(R.drawable.ic_flag_thailand);
                break;
            case 182:
                numValueOf = Integer.valueOf(R.drawable.ic_flash);
                break;
            case 184:
                numValueOf = Integer.valueOf(R.drawable.ic_from_to_tinted);
                break;
            case ModuleDescriptor.MODULE_VERSION /* 185 */:
                numValueOf = Integer.valueOf(R.drawable.ic_generic_checkout_error);
                break;
            case 186:
                numValueOf = Integer.valueOf(R.drawable.ic_gift_box);
                break;
            case 191:
                numValueOf = Integer.valueOf(R.drawable.ic_heart);
                break;
            case 192:
                numValueOf = Integer.valueOf(R.drawable.ic_history);
                break;
            case 193:
                numValueOf = Integer.valueOf(R.drawable.ic_home_search);
                break;
            case 194:
                numValueOf = Integer.valueOf(R.drawable.ic_home_selected);
                break;
            case 195:
                numValueOf = Integer.valueOf(R.drawable.ic_home_unselected);
                break;
            case 196:
                numValueOf = Integer.valueOf(R.drawable.ic_icon_ticket_black);
                break;
            case 200:
                numValueOf = Integer.valueOf(R.drawable.ic_info_grey_triangle);
                break;
            case ComposerKt.providerKey /* 201 */:
                numValueOf = Integer.valueOf(R.drawable.ic_info_i);
                break;
            case ComposerKt.providerMapsKey /* 204 */:
                numValueOf = Integer.valueOf(R.drawable.ic_location_pin);
                break;
            case 205:
                numValueOf = Integer.valueOf(R.drawable.ic_location_pin_colored);
                break;
            case 208:
                numValueOf = Integer.valueOf(R.drawable.ic_message);
                break;
            case 213:
                numValueOf = Integer.valueOf(R.drawable.ic_my_tickets_selected);
                break;
            case 214:
                numValueOf = Integer.valueOf(R.drawable.ic_my_tickets_unselected);
                break;
            case 216:
                numValueOf = Integer.valueOf(R.drawable.ic_next);
                break;
            case 220:
                numValueOf = Integer.valueOf(R.drawable.ic_no_od_pair);
                break;
            case 221:
                numValueOf = Integer.valueOf(R.drawable.ic_no_quick_pay_transactions);
                break;
            case 223:
                numValueOf = Integer.valueOf(R.drawable.ic_notification_turn_on);
                break;
            case 229:
                numValueOf = Integer.valueOf(R.drawable.ic_orange_circular_plus);
                break;
            case 230:
                numValueOf = Integer.valueOf(R.drawable.ic_orange_tint_arrow);
                break;
            case 233:
                numValueOf = Integer.valueOf(R.drawable.ic_pay_for_ticket);
                break;
            case 234:
                numValueOf = Integer.valueOf(R.drawable.ic_pay_for_ticket_3d);
                break;
            case 236:
                numValueOf = Integer.valueOf(R.drawable.ic_phone_msg);
                break;
            case 241:
                numValueOf = Integer.valueOf(R.drawable.ic_previous);
                break;
            case 242:
                numValueOf = Integer.valueOf(R.drawable.ic_product_fallback);
                break;
            case 244:
                numValueOf = Integer.valueOf(R.drawable.ic_profile);
                break;
            case 248:
                numValueOf = Integer.valueOf(R.drawable.ic_recliner_seat);
                break;
            case 252:
                numValueOf = Integer.valueOf(R.drawable.ic_regular_bus);
                break;
            case 253:
                numValueOf = Integer.valueOf(R.drawable.ic_regular_bus_fallback);
                break;
            case 254:
                numValueOf = Integer.valueOf(R.drawable.ic_regular_bus_selected);
                break;
            case 255:
                numValueOf = Integer.valueOf(R.drawable.ic_regular_bus_unselected);
                break;
            case 260:
                numValueOf = Integer.valueOf(R.drawable.ic_search_active);
                break;
            case 261:
                numValueOf = Integer.valueOf(R.drawable.ic_search_inactive);
                break;
            case 262:
                numValueOf = Integer.valueOf(R.drawable.ic_seat_black);
                break;
            case 263:
                numValueOf = Integer.valueOf(R.drawable.ic_seat_icon);
                break;
            case 267:
                numValueOf = Integer.valueOf(R.drawable.ic_sos);
                break;
            case 274:
                numValueOf = Integer.valueOf(R.drawable.ic_stop_directions);
                break;
            case 275:
                numValueOf = Integer.valueOf(R.drawable.ic_stop_icon);
                break;
            case 279:
                numValueOf = Integer.valueOf(R.drawable.ic_system_rescheduled);
                break;
            case 280:
                numValueOf = Integer.valueOf(R.drawable.ic_ticket);
                break;
            case 283:
                numValueOf = Integer.valueOf(R.drawable.ic_trip_cancelled_ack);
                break;
            case 285:
                numValueOf = Integer.valueOf(R.drawable.ic_truecaller);
                break;
            case 286:
                numValueOf = Integer.valueOf(R.drawable.ic_unlink);
                break;
            case 288:
                numValueOf = Integer.valueOf(R.drawable.ic_user_consent);
                break;
            case 295:
                numValueOf = Integer.valueOf(R.drawable.icon_chalo_wallet);
                break;
            case 296:
                numValueOf = Integer.valueOf(R.drawable.icon_help);
                break;
            case 297:
                numValueOf = Integer.valueOf(R.drawable.icon_profile);
                break;
            case 298:
                numValueOf = Integer.valueOf(R.drawable.icon_ticket);
                break;
            case 302:
                numValueOf = Integer.valueOf(R.drawable.info_occupancy);
                break;
            case 303:
                numValueOf = Integer.valueOf(R.drawable.internet_failure);
                break;
            case 306:
                numValueOf = Integer.valueOf(R.drawable.landing_page_pre_booking_nudge_card);
                break;
            case 307:
                numValueOf = Integer.valueOf(R.drawable.lazy_pay);
                break;
            case 308:
                numValueOf = Integer.valueOf(R.drawable.less_coverage);
                break;
            case 309:
                numValueOf = Integer.valueOf(R.drawable.live_bus);
                break;
            case 310:
                numValueOf = Integer.valueOf(R.drawable.live_bus2_delay);
                break;
            case 311:
                numValueOf = Integer.valueOf(R.drawable.live_bus2_direction_delay);
                break;
            case 312:
                numValueOf = Integer.valueOf(R.drawable.live_bus_list_delayed);
                break;
            case 313:
                numValueOf = Integer.valueOf(R.drawable.live_bus2);
                break;
            case 314:
                numValueOf = Integer.valueOf(R.drawable.live_bus2_direction);
                break;
            case 315:
                numValueOf = Integer.valueOf(R.drawable.live_tracking);
                break;
            case TypedValues.AttributesType.TYPE_EASING /* 317 */:
                numValueOf = Integer.valueOf(R.drawable.location_search);
                break;
            case 320:
                numValueOf = Integer.valueOf(R.drawable.logo_chalo);
                break;
            case 321:
                numValueOf = Integer.valueOf(R.drawable.map_center_pin);
                break;
            case 323:
                numValueOf = Integer.valueOf(R.drawable.metro_nearby);
                break;
            case 324:
                numValueOf = Integer.valueOf(R.drawable.metro_nearby_card_item_icon);
                break;
            case 325:
                numValueOf = Integer.valueOf(R.drawable.metro_search);
                break;
            case 330:
                numValueOf = Integer.valueOf(R.drawable.monorail_nearby);
                break;
            case 331:
                numValueOf = Integer.valueOf(R.drawable.monorail_nearby_card_item_icon);
                break;
            case 332:
                numValueOf = Integer.valueOf(R.drawable.monorail_search);
                break;
            case 334:
                numValueOf = Integer.valueOf(R.drawable.my_location_homescreen);
                break;
            case 336:
                numValueOf = Integer.valueOf(R.drawable.netbanking);
                break;
            case 337:
                numValueOf = Integer.valueOf(R.drawable.no_internet_error);
                break;
            case 338:
                numValueOf = Integer.valueOf(R.drawable.no_live_tracking);
                break;
            case 339:
                numValueOf = Integer.valueOf(R.drawable.off_duty);
                break;
            case 341:
                numValueOf = Integer.valueOf(R.drawable.ondc_logo);
                break;
            case 344:
                numValueOf = Integer.valueOf(R.drawable.overcrowded);
                break;
            case 348:
                numValueOf = Integer.valueOf(R.drawable.pass_success);
                break;
            case 349:
                numValueOf = Integer.valueOf(R.drawable.pass_unsuccess);
                break;
            case 356:
                numValueOf = Integer.valueOf(R.drawable.pic_edit);
                break;
            case 360:
                numValueOf = Integer.valueOf(R.drawable.profile_edit);
                break;
            case 361:
                numValueOf = Integer.valueOf(R.drawable.profile_empty);
                break;
            case 362:
                numValueOf = Integer.valueOf(R.drawable.rate);
                break;
            case 363:
                numValueOf = Integer.valueOf(R.drawable.real_time_indicator_png);
                break;
            case 365:
                numValueOf = Integer.valueOf(R.drawable.recharge_chalo_pay_wallet_icon);
                break;
            case 369:
                numValueOf = Integer.valueOf(R.drawable.replay);
                break;
            case 370:
                numValueOf = Integer.valueOf(R.drawable.route_list_live_direction);
                break;
            case 371:
                numValueOf = Integer.valueOf(R.drawable.route_report_problem);
                break;
            case 372:
                numValueOf = Integer.valueOf(R.drawable.route_screen_menu);
                break;
            case 374:
                numValueOf = Integer.valueOf(R.drawable.search);
                break;
            case 376:
                numValueOf = Integer.valueOf(R.drawable.seats_available);
                break;
            case 380:
                numValueOf = Integer.valueOf(R.drawable.standing_available);
                break;
            case 383:
                numValueOf = Integer.valueOf(R.drawable.start);
                break;
            case 385:
                numValueOf = Integer.valueOf(R.drawable.stop_marker_route_details);
                break;
            case 386:
                numValueOf = Integer.valueOf(R.drawable.stop_marker_route_details_disabled);
                break;
            case 391:
                numValueOf = Integer.valueOf(R.drawable.thumb);
                break;
            case 393:
                numValueOf = Integer.valueOf(R.drawable.ticket_punch_success);
                break;
            case 394:
                numValueOf = Integer.valueOf(R.drawable.traffic);
                break;
            case 395:
                numValueOf = Integer.valueOf(R.drawable.traffic_signal);
                break;
            case 396:
                numValueOf = Integer.valueOf(R.drawable.train_homescreen);
                break;
            case 397:
                numValueOf = Integer.valueOf(R.drawable.train_nearby);
                break;
            case 398:
                numValueOf = Integer.valueOf(R.drawable.train_nearby_card_item_icon);
                break;
            case 399:
                numValueOf = Integer.valueOf(R.drawable.train_search);
                break;
            case WalletConstants.ERROR_CODE_INVALID_PARAMETERS /* 404 */:
                numValueOf = Integer.valueOf(R.drawable.upi);
                break;
            case WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR /* 405 */:
                numValueOf = Integer.valueOf(R.drawable.upi_empty);
                break;
            case 408:
                numValueOf = Integer.valueOf(R.drawable.walk_nearby);
                break;
            case WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR /* 409 */:
                numValueOf = Integer.valueOf(R.drawable.walk_nearbycard_black);
                break;
            case WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE /* 415 */:
                numValueOf = Integer.valueOf(R.drawable.wallet_introduction);
                break;
            case 417:
                numValueOf = Integer.valueOf(R.drawable.wallet_not_activated);
                break;
            case 418:
                numValueOf = Integer.valueOf(R.drawable.wallet_resized);
                break;
            case 419:
                numValueOf = Integer.valueOf(R.drawable.wallet_transaction_failed);
                break;
            case TypedValues.CycleType.TYPE_EASING /* 420 */:
                numValueOf = Integer.valueOf(R.drawable.wallet_transaction_pending);
                break;
            case 421:
                numValueOf = Integer.valueOf(R.drawable.wallet_transaction_success);
                break;
            case TypedValues.CycleType.TYPE_WAVE_PHASE /* 425 */:
                numValueOf = Integer.valueOf(R.drawable.weather);
                break;
            case 426:
                numValueOf = Integer.valueOf(R.drawable.yes_bank);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            String lowerCase = iconType.name().toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            return new IconAsset(iIntValue, lowerCase);
        }
        throw new IllegalArgumentException(("Drawable resource not found for icon type: " + iconType + ". Make sure to add it inside chalo-base/main/drawable").toString());
    }
}
