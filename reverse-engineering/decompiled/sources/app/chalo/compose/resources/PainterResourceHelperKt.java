package app.chalo.compose.resources;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImplKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.spatial.RectListKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.providers.iconassetprovider.IconAssetProvider;
import app.chalo.providers.iconassetprovider.IconType;
import chalo_app_kmm.shared.chalo_base.generated.resources.Drawable0_commonMainKt;
import chalo_app_kmm.shared.chalo_base.generated.resources.Drawable1_commonMainKt;
import chalo_app_kmm.shared.chalo_base.generated.resources.Drawable2_commonMainKt;
import chalo_app_kmm.shared.chalo_base.generated.resources.Drawable3_commonMainKt;
import com.adjust.sdk.Constants;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.math.Primes;
import org.jetbrains.compose.resources.DrawableResource;
import org.jetbrains.compose.resources.ImageResourcesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PainterResourceHelperKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1909a;

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
                iArr[IconType.IC_NO_OD_PAIR.ordinal()] = 219;
            } catch (NoSuchFieldError unused219) {
            }
            try {
                iArr[IconType.IC_NO_PHOTO.ordinal()] = 220;
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
            f1909a = iArr;
        }
    }

    public static final Painter a(IconType iconType, Composer composer, int i) {
        Object objA;
        Intrinsics.i(iconType, "iconType");
        composer.startReplaceGroup(-583692404);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-583692404, i, -1, "app.chalo.compose.resources.commonPainterResource (PainterResourceHelper.kt:15)");
        }
        DrawableResource drawableResourceB = b(iconType);
        if (drawableResourceB != null) {
            composer.startReplaceGroup(1542322835);
            Painter painterA = ImageResourcesKt.a(drawableResourceB, composer);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return painterA;
        }
        composer.startReplaceGroup(1542400397);
        int i2 = i & 14;
        boolean z = ((i2 ^ 6) > 4 && composer.changed(iconType.ordinal())) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new PainterResourceHelperKt$commonPainterResource$1$1(iconType, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        EffectsKt.LaunchedEffect(iconType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, i2);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-135917080, i2, -1, "app.chalo.providers.iconassetprovider.platformPainterIfValid (IconAssetProvider.android.kt:456)");
        }
        IconAssetProvider iconAssetProvider = (IconAssetProvider) composer.consume(IconAssetHelperKt.f1906a);
        composer.startReplaceGroup(-1767290434);
        try {
            objA = PainterResources_androidKt.painterResource(iconAssetProvider.a(iconType).f8859a, composer, 0);
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        composer.endReplaceGroup();
        Painter painter = (Painter) (objA instanceof Result.Failure ? null : objA);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        if (painter != null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return painter;
        }
        throw new IllegalStateException(iconType + " icon missing in platform and common resources");
    }

    public static final DrawableResource b(IconType iconType) {
        Intrinsics.i(iconType, "<this>");
        switch (WhenMappings.f1909a[iconType.ordinal()]) {
            case 1:
                return (DrawableResource) Drawable0_commonMainKt.f11289a.getValue();
            case 2:
                return (DrawableResource) Drawable0_commonMainKt.b.getValue();
            case 3:
                return (DrawableResource) Drawable0_commonMainKt.c.getValue();
            case 4:
                return (DrawableResource) Drawable0_commonMainKt.d.getValue();
            case 5:
                return (DrawableResource) Drawable0_commonMainKt.e.getValue();
            case 6:
                return (DrawableResource) Drawable0_commonMainKt.f.getValue();
            case 7:
                return (DrawableResource) Drawable0_commonMainKt.g.getValue();
            case 8:
                return (DrawableResource) Drawable0_commonMainKt.h.getValue();
            case 9:
                return (DrawableResource) Drawable0_commonMainKt.i.getValue();
            case 10:
                return (DrawableResource) Drawable0_commonMainKt.j.getValue();
            case 11:
                return (DrawableResource) Drawable0_commonMainKt.k.getValue();
            case 12:
                return (DrawableResource) Drawable0_commonMainKt.l.getValue();
            case 13:
                return (DrawableResource) Drawable0_commonMainKt.m.getValue();
            case 14:
                return (DrawableResource) Drawable0_commonMainKt.n.getValue();
            case 15:
            case 19:
            case 21:
            case 23:
            case 33:
            case 34:
            case 43:
            case 65:
            case EACTags.ANSWER_TO_RESET /* 81 */:
            case 85:
            case 93:
            case 112:
            case 133:
            case 152:
            case 186:
            case 263:
            case 280:
            case 285:
            case 306:
            case 308:
            case 310:
            case 311:
            case 313:
            case 314:
            case 315:
            case 323:
            case 330:
            case 338:
            case 339:
            case 369:
            case 395:
            case 397:
            case 408:
                return null;
            case 16:
                return (DrawableResource) Drawable0_commonMainKt.o.getValue();
            case 17:
                return (DrawableResource) Drawable0_commonMainKt.p.getValue();
            case 18:
                return (DrawableResource) Drawable0_commonMainKt.q.getValue();
            case 20:
                return (DrawableResource) Drawable0_commonMainKt.r.getValue();
            case 22:
                return (DrawableResource) Drawable0_commonMainKt.v.getValue();
            case 24:
                return (DrawableResource) Drawable0_commonMainKt.w.getValue();
            case 25:
                return (DrawableResource) Drawable1_commonMainKt.h.getValue();
            case 26:
                return (DrawableResource) Drawable0_commonMainKt.z.getValue();
            case 27:
                return (DrawableResource) Drawable0_commonMainKt.A.getValue();
            case 28:
                return (DrawableResource) Drawable0_commonMainKt.B.getValue();
            case 29:
                return (DrawableResource) Drawable0_commonMainKt.C.getValue();
            case 30:
                return (DrawableResource) Drawable0_commonMainKt.D.getValue();
            case 31:
                return (DrawableResource) Drawable0_commonMainKt.F.getValue();
            case 32:
                return (DrawableResource) Drawable0_commonMainKt.E.getValue();
            case 35:
                return (DrawableResource) Drawable0_commonMainKt.G.getValue();
            case 36:
                return (DrawableResource) Drawable0_commonMainKt.H.getValue();
            case 37:
                return (DrawableResource) Drawable0_commonMainKt.I.getValue();
            case 38:
                return (DrawableResource) Drawable0_commonMainKt.J.getValue();
            case 39:
                return (DrawableResource) Drawable0_commonMainKt.K.getValue();
            case 40:
                return (DrawableResource) Drawable0_commonMainKt.L.getValue();
            case 41:
                return (DrawableResource) Drawable0_commonMainKt.M.getValue();
            case 42:
                return (DrawableResource) Drawable0_commonMainKt.N.getValue();
            case 44:
                return (DrawableResource) Drawable0_commonMainKt.O.getValue();
            case 45:
                return (DrawableResource) Drawable0_commonMainKt.P.getValue();
            case 46:
                return (DrawableResource) Drawable0_commonMainKt.Q.getValue();
            case 47:
                return (DrawableResource) Drawable0_commonMainKt.R.getValue();
            case 48:
                return (DrawableResource) Drawable0_commonMainKt.S.getValue();
            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                return (DrawableResource) Drawable0_commonMainKt.T.getValue();
            case 50:
                return (DrawableResource) Drawable0_commonMainKt.U.getValue();
            case 51:
                return (DrawableResource) Drawable0_commonMainKt.W.getValue();
            case 52:
                return (DrawableResource) Drawable0_commonMainKt.X.getValue();
            case 53:
                return (DrawableResource) Drawable0_commonMainKt.Y.getValue();
            case 54:
                return (DrawableResource) Drawable0_commonMainKt.Z.getValue();
            case 55:
                return (DrawableResource) Drawable0_commonMainKt.a0.getValue();
            case 56:
                return (DrawableResource) Drawable0_commonMainKt.b0.getValue();
            case 57:
                return (DrawableResource) Drawable0_commonMainKt.c0.getValue();
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                return (DrawableResource) Drawable0_commonMainKt.d0.getValue();
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                return (DrawableResource) Drawable0_commonMainKt.e0.getValue();
            case 60:
                return (DrawableResource) Drawable0_commonMainKt.f0.getValue();
            case 61:
                return (DrawableResource) Drawable0_commonMainKt.g0.getValue();
            case RectListKt.BitOffsetForGesturable /* 62 */:
                return (DrawableResource) Drawable0_commonMainKt.h0.getValue();
            case 63:
                return (DrawableResource) Drawable0_commonMainKt.i0.getValue();
            case 64:
                return (DrawableResource) Drawable0_commonMainKt.l0.getValue();
            case 66:
                return (DrawableResource) Drawable0_commonMainKt.j0.getValue();
            case 67:
                return (DrawableResource) Drawable0_commonMainKt.k0.getValue();
            case EACTags.APPLICATION_IMAGE /* 68 */:
                return (DrawableResource) Drawable0_commonMainKt.m0.getValue();
            case EACTags.DISPLAY_IMAGE /* 69 */:
                return (DrawableResource) Drawable0_commonMainKt.n0.getValue();
            case 70:
                return (DrawableResource) Drawable0_commonMainKt.o0.getValue();
            case 71:
                return (DrawableResource) Drawable0_commonMainKt.p0.getValue();
            case 72:
                return (DrawableResource) Drawable0_commonMainKt.q0.getValue();
            case 73:
                return (DrawableResource) Drawable0_commonMainKt.r0.getValue();
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                return (DrawableResource) Drawable0_commonMainKt.s0.getValue();
            case EACTags.DEPRECATED /* 75 */:
                return (DrawableResource) Drawable0_commonMainKt.t0.getValue();
            case 76:
                return (DrawableResource) Drawable0_commonMainKt.u0.getValue();
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                return (DrawableResource) Drawable0_commonMainKt.v0.getValue();
            case 78:
                return (DrawableResource) Drawable0_commonMainKt.w0.getValue();
            case 79:
                return (DrawableResource) Drawable0_commonMainKt.x0.getValue();
            case 80:
                return (DrawableResource) Drawable0_commonMainKt.z0.getValue();
            case EACTags.HISTORICAL_BYTES /* 82 */:
                return (DrawableResource) Drawable0_commonMainKt.A0.getValue();
            case 83:
                return (DrawableResource) Drawable0_commonMainKt.B0.getValue();
            case 84:
                return (DrawableResource) Drawable1_commonMainKt.A0.getValue();
            case 86:
                return (DrawableResource) Drawable0_commonMainKt.D0.getValue();
            case 87:
                return (DrawableResource) Drawable0_commonMainKt.F0.getValue();
            case 88:
                return (DrawableResource) Drawable0_commonMainKt.G0.getValue();
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                return (DrawableResource) Drawable0_commonMainKt.H0.getValue();
            case 90:
                return (DrawableResource) Drawable0_commonMainKt.I0.getValue();
            case 91:
                return (DrawableResource) Drawable0_commonMainKt.J0.getValue();
            case 92:
                return (DrawableResource) Drawable0_commonMainKt.K0.getValue();
            case 94:
                return (DrawableResource) Drawable0_commonMainKt.L0.getValue();
            case 95:
                return (DrawableResource) Drawable0_commonMainKt.M0.getValue();
            case 96:
                return (DrawableResource) Drawable0_commonMainKt.N0.getValue();
            case 97:
                return (DrawableResource) Drawable0_commonMainKt.O0.getValue();
            case 98:
                return (DrawableResource) Drawable0_commonMainKt.P0.getValue();
            case 99:
                return (DrawableResource) Drawable0_commonMainKt.Q0.getValue();
            case 100:
                return (DrawableResource) Drawable0_commonMainKt.R0.getValue();
            case 101:
                return (DrawableResource) Drawable0_commonMainKt.S0.getValue();
            case 102:
                return (DrawableResource) Drawable0_commonMainKt.T0.getValue();
            case 103:
                return (DrawableResource) Drawable0_commonMainKt.U0.getValue();
            case 104:
                return (DrawableResource) Drawable0_commonMainKt.V0.getValue();
            case 105:
                return (DrawableResource) Drawable1_commonMainKt.f11290a.getValue();
            case 106:
                return (DrawableResource) Drawable1_commonMainKt.b.getValue();
            case 107:
                return (DrawableResource) Drawable1_commonMainKt.c.getValue();
            case 108:
                return (DrawableResource) Drawable1_commonMainKt.d.getValue();
            case 109:
                return (DrawableResource) Drawable1_commonMainKt.e.getValue();
            case FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD /* 110 */:
                return (DrawableResource) Drawable1_commonMainKt.f.getValue();
            case FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION /* 111 */:
                return (DrawableResource) Drawable1_commonMainKt.g.getValue();
            case 113:
                return (DrawableResource) Drawable1_commonMainKt.i.getValue();
            case 114:
                return (DrawableResource) Drawable1_commonMainKt.j.getValue();
            case 115:
                return (DrawableResource) Drawable1_commonMainKt.k.getValue();
            case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                return (DrawableResource) Drawable1_commonMainKt.l.getValue();
            case 117:
                return (DrawableResource) Drawable1_commonMainKt.m.getValue();
            case 118:
                return (DrawableResource) Drawable1_commonMainKt.n.getValue();
            case 119:
                return (DrawableResource) Drawable2_commonMainKt.d.getValue();
            case 120:
                return (DrawableResource) Drawable1_commonMainKt.o.getValue();
            case 121:
                return (DrawableResource) Drawable1_commonMainKt.p.getValue();
            case 122:
                return (DrawableResource) Drawable1_commonMainKt.q.getValue();
            case 123:
                return (DrawableResource) Drawable1_commonMainKt.r.getValue();
            case 124:
                return (DrawableResource) Drawable1_commonMainKt.s.getValue();
            case ComposerImplKt.nodeKey /* 125 */:
                return (DrawableResource) Drawable1_commonMainKt.t.getValue();
            case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                return (DrawableResource) Drawable1_commonMainKt.u.getValue();
            case 127:
                return (DrawableResource) Drawable1_commonMainKt.v.getValue();
            case 128:
                return (DrawableResource) Drawable1_commonMainKt.w.getValue();
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                return (DrawableResource) Drawable1_commonMainKt.x.getValue();
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                return (DrawableResource) Drawable1_commonMainKt.y.getValue();
            case 131:
                return (DrawableResource) Drawable1_commonMainKt.B.getValue();
            case 132:
                return (DrawableResource) Drawable1_commonMainKt.z.getValue();
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                return (DrawableResource) Drawable1_commonMainKt.A.getValue();
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                return (DrawableResource) Drawable1_commonMainKt.C.getValue();
            case TsExtractor.TS_STREAM_TYPE_DTS_HD /* 136 */:
                return (DrawableResource) Drawable1_commonMainKt.D.getValue();
            case 137:
                return (DrawableResource) Drawable1_commonMainKt.E.getValue();
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                return (DrawableResource) Drawable1_commonMainKt.F.getValue();
            case TsExtractor.TS_STREAM_TYPE_DTS_UHD /* 139 */:
                return (DrawableResource) Drawable0_commonMainKt.V.getValue();
            case 140:
                return (DrawableResource) Drawable1_commonMainKt.G.getValue();
            case 141:
                return (DrawableResource) Drawable1_commonMainKt.I.getValue();
            case 142:
                return (DrawableResource) Drawable1_commonMainKt.J.getValue();
            case 143:
                return (DrawableResource) Drawable1_commonMainKt.K.getValue();
            case 144:
                return (DrawableResource) Drawable1_commonMainKt.L.getValue();
            case 145:
                return (DrawableResource) Drawable1_commonMainKt.M.getValue();
            case 146:
                return (DrawableResource) Drawable1_commonMainKt.N.getValue();
            case 147:
                return (DrawableResource) Drawable1_commonMainKt.O.getValue();
            case 148:
                return (DrawableResource) Drawable1_commonMainKt.P.getValue();
            case 149:
                return (DrawableResource) Drawable1_commonMainKt.Q.getValue();
            case 150:
                return (DrawableResource) Drawable1_commonMainKt.R.getValue();
            case 151:
                return (DrawableResource) Drawable1_commonMainKt.S.getValue();
            case 153:
                return (DrawableResource) Drawable1_commonMainKt.T.getValue();
            case 154:
                return (DrawableResource) Drawable1_commonMainKt.U.getValue();
            case 155:
                return (DrawableResource) Drawable1_commonMainKt.V.getValue();
            case 156:
                return (DrawableResource) Drawable1_commonMainKt.W.getValue();
            case 157:
                return (DrawableResource) Drawable1_commonMainKt.X.getValue();
            case 158:
                return (DrawableResource) Drawable1_commonMainKt.Y.getValue();
            case 159:
                return (DrawableResource) Drawable1_commonMainKt.Z.getValue();
            case 160:
                return (DrawableResource) Drawable1_commonMainKt.a0.getValue();
            case 161:
                return (DrawableResource) Drawable1_commonMainKt.b0.getValue();
            case 162:
                return (DrawableResource) Drawable1_commonMainKt.c0.getValue();
            case 163:
                return (DrawableResource) Drawable1_commonMainKt.d0.getValue();
            case 164:
                return (DrawableResource) Drawable1_commonMainKt.e0.getValue();
            case 165:
                return (DrawableResource) Drawable1_commonMainKt.f0.getValue();
            case 166:
                return (DrawableResource) Drawable1_commonMainKt.g0.getValue();
            case 167:
                return (DrawableResource) Drawable1_commonMainKt.h0.getValue();
            case 168:
                return (DrawableResource) Drawable1_commonMainKt.i0.getValue();
            case 169:
                return (DrawableResource) Drawable1_commonMainKt.j0.getValue();
            case 170:
                return (DrawableResource) Drawable1_commonMainKt.k0.getValue();
            case 171:
                return (DrawableResource) Drawable1_commonMainKt.l0.getValue();
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                return (DrawableResource) Drawable1_commonMainKt.m0.getValue();
            case 173:
                return (DrawableResource) Drawable1_commonMainKt.n0.getValue();
            case 174:
                return (DrawableResource) Drawable1_commonMainKt.o0.getValue();
            case 175:
                return (DrawableResource) Drawable1_commonMainKt.p0.getValue();
            case 176:
                return (DrawableResource) Drawable1_commonMainKt.H.getValue();
            case 177:
                return (DrawableResource) Drawable1_commonMainKt.q0.getValue();
            case 178:
                return (DrawableResource) Drawable1_commonMainKt.r0.getValue();
            case 179:
                return (DrawableResource) Drawable1_commonMainKt.s0.getValue();
            case 180:
                return (DrawableResource) Drawable1_commonMainKt.t0.getValue();
            case 181:
                return (DrawableResource) Drawable1_commonMainKt.u0.getValue();
            case 182:
                return (DrawableResource) Drawable1_commonMainKt.v0.getValue();
            case 183:
                return (DrawableResource) Drawable1_commonMainKt.w0.getValue();
            case 184:
                return (DrawableResource) Drawable1_commonMainKt.x0.getValue();
            case ModuleDescriptor.MODULE_VERSION /* 185 */:
                return (DrawableResource) Drawable1_commonMainKt.y0.getValue();
            case 187:
                return (DrawableResource) Drawable1_commonMainKt.z0.getValue();
            case 188:
                return (DrawableResource) Drawable1_commonMainKt.B0.getValue();
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                return (DrawableResource) Drawable1_commonMainKt.C0.getValue();
            case 190:
                return (DrawableResource) Drawable1_commonMainKt.E0.getValue();
            case 191:
                return (DrawableResource) Drawable1_commonMainKt.F0.getValue();
            case 192:
                return (DrawableResource) Drawable1_commonMainKt.G0.getValue();
            case 193:
                return (DrawableResource) Drawable1_commonMainKt.H0.getValue();
            case 194:
                return (DrawableResource) Drawable1_commonMainKt.I0.getValue();
            case 195:
                return (DrawableResource) Drawable1_commonMainKt.J0.getValue();
            case 196:
                return (DrawableResource) Drawable1_commonMainKt.M0.getValue();
            case 197:
                return (DrawableResource) Drawable1_commonMainKt.N0.getValue();
            case 198:
                return (DrawableResource) Drawable1_commonMainKt.O0.getValue();
            case 199:
                return (DrawableResource) Drawable1_commonMainKt.P0.getValue();
            case 200:
                return (DrawableResource) Drawable1_commonMainKt.Q0.getValue();
            case ComposerKt.providerKey /* 201 */:
                return (DrawableResource) Drawable1_commonMainKt.R0.getValue();
            case ComposerKt.compositionLocalMapKey /* 202 */:
                return (DrawableResource) Drawable1_commonMainKt.S0.getValue();
            case ComposerKt.providerValuesKey /* 203 */:
                return (DrawableResource) Drawable1_commonMainKt.T0.getValue();
            case ComposerKt.providerMapsKey /* 204 */:
                return (DrawableResource) Drawable1_commonMainKt.U0.getValue();
            case 205:
                return (DrawableResource) Drawable1_commonMainKt.V0.getValue();
            case ComposerKt.referenceKey /* 206 */:
                return (DrawableResource) Drawable2_commonMainKt.f11291a.getValue();
            case ComposerKt.reuseKey /* 207 */:
                return (DrawableResource) Drawable2_commonMainKt.b.getValue();
            case 208:
                return (DrawableResource) Drawable2_commonMainKt.c.getValue();
            case 209:
                return (DrawableResource) Drawable2_commonMainKt.e.getValue();
            case 210:
                return (DrawableResource) Drawable2_commonMainKt.f.getValue();
            case Primes.SMALL_FACTOR_LIMIT /* 211 */:
                return (DrawableResource) Drawable2_commonMainKt.g.getValue();
            case 212:
                return (DrawableResource) Drawable2_commonMainKt.h.getValue();
            case 213:
                return (DrawableResource) Drawable2_commonMainKt.i.getValue();
            case 214:
                return (DrawableResource) Drawable2_commonMainKt.j.getValue();
            case 215:
                return (DrawableResource) Drawable2_commonMainKt.k.getValue();
            case 216:
                return (DrawableResource) Drawable2_commonMainKt.l.getValue();
            case 217:
                return (DrawableResource) Drawable2_commonMainKt.m.getValue();
            case 218:
                return (DrawableResource) Drawable2_commonMainKt.n.getValue();
            case 219:
                return (DrawableResource) Drawable2_commonMainKt.o.getValue();
            case 220:
                return (DrawableResource) Drawable2_commonMainKt.p.getValue();
            case 221:
                return (DrawableResource) Drawable2_commonMainKt.q.getValue();
            case 222:
                return (DrawableResource) Drawable2_commonMainKt.r.getValue();
            case 223:
                return (DrawableResource) Drawable2_commonMainKt.s.getValue();
            case 224:
                return (DrawableResource) Drawable2_commonMainKt.t.getValue();
            case 225:
                return (DrawableResource) Drawable2_commonMainKt.u.getValue();
            case 226:
                return (DrawableResource) Drawable2_commonMainKt.w.getValue();
            case 227:
                return (DrawableResource) Drawable2_commonMainKt.v.getValue();
            case 228:
                return (DrawableResource) Drawable2_commonMainKt.x.getValue();
            case 229:
                return (DrawableResource) Drawable2_commonMainKt.y.getValue();
            case 230:
                return (DrawableResource) Drawable2_commonMainKt.z.getValue();
            case 231:
                return (DrawableResource) Drawable2_commonMainKt.A.getValue();
            case 232:
                return (DrawableResource) Drawable2_commonMainKt.B.getValue();
            case 233:
                return (DrawableResource) Drawable2_commonMainKt.C.getValue();
            case 234:
                return (DrawableResource) Drawable2_commonMainKt.D.getValue();
            case 235:
                return (DrawableResource) Drawable2_commonMainKt.E.getValue();
            case 236:
                return (DrawableResource) Drawable2_commonMainKt.F.getValue();
            case 237:
                return (DrawableResource) Drawable2_commonMainKt.I.getValue();
            case 238:
                return (DrawableResource) Drawable2_commonMainKt.G.getValue();
            case 239:
                return (DrawableResource) Drawable2_commonMainKt.H.getValue();
            case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                return (DrawableResource) Drawable2_commonMainKt.J.getValue();
            case 241:
                return (DrawableResource) Drawable2_commonMainKt.K.getValue();
            case 242:
                return (DrawableResource) Drawable2_commonMainKt.L.getValue();
            case 243:
                return (DrawableResource) Drawable2_commonMainKt.M.getValue();
            case 244:
                return (DrawableResource) Drawable2_commonMainKt.N.getValue();
            case 245:
                return (DrawableResource) Drawable2_commonMainKt.O.getValue();
            case 246:
                return (DrawableResource) Drawable2_commonMainKt.P.getValue();
            case 247:
                return (DrawableResource) Drawable2_commonMainKt.Q.getValue();
            case 248:
                return (DrawableResource) Drawable2_commonMainKt.R.getValue();
            case 249:
                return (DrawableResource) Drawable2_commonMainKt.S.getValue();
            case 250:
                return (DrawableResource) Drawable2_commonMainKt.T.getValue();
            case 251:
                return (DrawableResource) Drawable2_commonMainKt.U.getValue();
            case 252:
                return (DrawableResource) Drawable2_commonMainKt.V.getValue();
            case 253:
                return (DrawableResource) Drawable2_commonMainKt.W.getValue();
            case 254:
                return (DrawableResource) Drawable2_commonMainKt.X.getValue();
            case 255:
                return (DrawableResource) Drawable2_commonMainKt.Y.getValue();
            case 256:
                return (DrawableResource) Drawable2_commonMainKt.Z.getValue();
            case 257:
                return (DrawableResource) Drawable2_commonMainKt.a0.getValue();
            case 258:
                return (DrawableResource) Drawable2_commonMainKt.b0.getValue();
            case 259:
                return (DrawableResource) Drawable2_commonMainKt.c0.getValue();
            case 260:
                return (DrawableResource) Drawable2_commonMainKt.d0.getValue();
            case 261:
                return (DrawableResource) Drawable2_commonMainKt.e0.getValue();
            case 262:
                return (DrawableResource) Drawable2_commonMainKt.f0.getValue();
            case 264:
                return (DrawableResource) Drawable2_commonMainKt.g0.getValue();
            case 265:
                return (DrawableResource) Drawable2_commonMainKt.h0.getValue();
            case 266:
                return (DrawableResource) Drawable2_commonMainKt.i0.getValue();
            case 267:
                return (DrawableResource) Drawable2_commonMainKt.j0.getValue();
            case 268:
                return (DrawableResource) Drawable2_commonMainKt.k0.getValue();
            case 269:
                return (DrawableResource) Drawable2_commonMainKt.m0.getValue();
            case 270:
                return (DrawableResource) Drawable2_commonMainKt.n0.getValue();
            case 271:
                return (DrawableResource) Drawable2_commonMainKt.q0.getValue();
            case 272:
                return (DrawableResource) Drawable2_commonMainKt.l0.getValue();
            case 273:
                return (DrawableResource) Drawable2_commonMainKt.o0.getValue();
            case 274:
                return (DrawableResource) Drawable2_commonMainKt.o0.getValue();
            case 275:
                return (DrawableResource) Drawable2_commonMainKt.p0.getValue();
            case 276:
                return (DrawableResource) Drawable2_commonMainKt.r0.getValue();
            case 277:
                return (DrawableResource) Drawable3_commonMainKt.i0.getValue();
            case 278:
                return (DrawableResource) Drawable2_commonMainKt.s0.getValue();
            case 279:
                return (DrawableResource) Drawable2_commonMainKt.t0.getValue();
            case 281:
                return (DrawableResource) Drawable2_commonMainKt.u0.getValue();
            case 282:
                return (DrawableResource) Drawable3_commonMainKt.v0.getValue();
            case 283:
                return (DrawableResource) Drawable2_commonMainKt.v0.getValue();
            case 284:
                return (DrawableResource) Drawable2_commonMainKt.w0.getValue();
            case 286:
                return (DrawableResource) Drawable2_commonMainKt.x0.getValue();
            case 287:
                return (DrawableResource) Drawable2_commonMainKt.y0.getValue();
            case 288:
                return (DrawableResource) Drawable2_commonMainKt.z0.getValue();
            case 289:
                return (DrawableResource) Drawable2_commonMainKt.V0.getValue();
            case 290:
                return (DrawableResource) Drawable0_commonMainKt.y0.getValue();
            case 291:
                return (DrawableResource) Drawable3_commonMainKt.u0.getValue();
            case 292:
                return (DrawableResource) Drawable2_commonMainKt.A0.getValue();
            case 293:
                return (DrawableResource) Drawable2_commonMainKt.B0.getValue();
            case 294:
                return (DrawableResource) Drawable2_commonMainKt.C0.getValue();
            case 295:
                return (DrawableResource) Drawable2_commonMainKt.D0.getValue();
            case 296:
                return (DrawableResource) Drawable2_commonMainKt.E0.getValue();
            case 297:
                return (DrawableResource) Drawable2_commonMainKt.F0.getValue();
            case 298:
                return (DrawableResource) Drawable2_commonMainKt.G0.getValue();
            case 299:
                return (DrawableResource) Drawable2_commonMainKt.I0.getValue();
            case 300:
                return (DrawableResource) Drawable1_commonMainKt.D0.getValue();
            case 301:
                return (DrawableResource) Drawable0_commonMainKt.E0.getValue();
            case 302:
                return (DrawableResource) Drawable2_commonMainKt.J0.getValue();
            case 303:
                return (DrawableResource) Drawable2_commonMainKt.K0.getValue();
            case 304:
                return (DrawableResource) Drawable2_commonMainKt.L0.getValue();
            case 305:
                return (DrawableResource) Drawable2_commonMainKt.M0.getValue();
            case 307:
                return (DrawableResource) Drawable2_commonMainKt.N0.getValue();
            case 309:
                return (DrawableResource) Drawable2_commonMainKt.O0.getValue();
            case 312:
                return (DrawableResource) Drawable2_commonMainKt.P0.getValue();
            case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                return (DrawableResource) Drawable2_commonMainKt.Q0.getValue();
            case TypedValues.AttributesType.TYPE_EASING /* 317 */:
                return (DrawableResource) Drawable2_commonMainKt.R0.getValue();
            case TypedValues.AttributesType.TYPE_PIVOT_TARGET /* 318 */:
                return (DrawableResource) Drawable2_commonMainKt.S0.getValue();
            case 319:
                return (DrawableResource) Drawable2_commonMainKt.T0.getValue();
            case 320:
                return (DrawableResource) Drawable2_commonMainKt.U0.getValue();
            case 321:
                return (DrawableResource) Drawable3_commonMainKt.f11292a.getValue();
            case 322:
                return (DrawableResource) Drawable3_commonMainKt.b.getValue();
            case 324:
                return (DrawableResource) Drawable3_commonMainKt.d.getValue();
            case 325:
                return (DrawableResource) Drawable3_commonMainKt.e.getValue();
            case 326:
                return (DrawableResource) Drawable3_commonMainKt.f.getValue();
            case 327:
                return (DrawableResource) Drawable3_commonMainKt.g.getValue();
            case 328:
                return (DrawableResource) Drawable3_commonMainKt.c.getValue();
            case 329:
                return (DrawableResource) Drawable3_commonMainKt.h.getValue();
            case 331:
                return (DrawableResource) Drawable3_commonMainKt.i.getValue();
            case 332:
                return (DrawableResource) Drawable3_commonMainKt.j.getValue();
            case 333:
                return (DrawableResource) Drawable3_commonMainKt.k.getValue();
            case 334:
                return (DrawableResource) Drawable3_commonMainKt.l.getValue();
            case 335:
                return (DrawableResource) Drawable3_commonMainKt.m.getValue();
            case 336:
                return (DrawableResource) Drawable3_commonMainKt.n.getValue();
            case 337:
                return (DrawableResource) Drawable3_commonMainKt.o.getValue();
            case 340:
                return (DrawableResource) Drawable3_commonMainKt.p.getValue();
            case 341:
                return (DrawableResource) Drawable3_commonMainKt.q.getValue();
            case 342:
                return (DrawableResource) Drawable3_commonMainKt.r.getValue();
            case 343:
                return (DrawableResource) Drawable3_commonMainKt.t.getValue();
            case 344:
                return (DrawableResource) Drawable3_commonMainKt.u.getValue();
            case 345:
                return (DrawableResource) Drawable3_commonMainKt.v.getValue();
            case 346:
                return (DrawableResource) Drawable3_commonMainKt.w.getValue();
            case 347:
                return (DrawableResource) Drawable1_commonMainKt.K0.getValue();
            case 348:
                return (DrawableResource) Drawable3_commonMainKt.x.getValue();
            case 349:
                return (DrawableResource) Drawable3_commonMainKt.y.getValue();
            case 350:
                return (DrawableResource) Drawable3_commonMainKt.z.getValue();
            case 351:
                return (DrawableResource) Drawable3_commonMainKt.A.getValue();
            case 352:
                return (DrawableResource) Drawable3_commonMainKt.B.getValue();
            case 353:
                return (DrawableResource) Drawable3_commonMainKt.C.getValue();
            case 354:
                return (DrawableResource) Drawable3_commonMainKt.D.getValue();
            case 355:
                return (DrawableResource) Drawable3_commonMainKt.E.getValue();
            case 356:
                return (DrawableResource) Drawable3_commonMainKt.F.getValue();
            case 357:
                return (DrawableResource) Drawable3_commonMainKt.G.getValue();
            case 358:
                return (DrawableResource) Drawable3_commonMainKt.H.getValue();
            case 359:
                return (DrawableResource) Drawable3_commonMainKt.I.getValue();
            case 360:
                return (DrawableResource) Drawable3_commonMainKt.J.getValue();
            case 361:
                return (DrawableResource) Drawable3_commonMainKt.K.getValue();
            case 362:
                return (DrawableResource) Drawable3_commonMainKt.L.getValue();
            case 363:
                return (DrawableResource) Drawable3_commonMainKt.M.getValue();
            case 364:
                return (DrawableResource) Drawable3_commonMainKt.N.getValue();
            case 365:
                return (DrawableResource) Drawable3_commonMainKt.O.getValue();
            case 366:
                return (DrawableResource) Drawable3_commonMainKt.P.getValue();
            case 367:
                return (DrawableResource) Drawable3_commonMainKt.Q.getValue();
            case 368:
                return (DrawableResource) Drawable3_commonMainKt.R.getValue();
            case 370:
                return (DrawableResource) Drawable3_commonMainKt.S.getValue();
            case 371:
                return (DrawableResource) Drawable3_commonMainKt.T.getValue();
            case 372:
                return (DrawableResource) Drawable3_commonMainKt.U.getValue();
            case 373:
                return (DrawableResource) Drawable2_commonMainKt.H0.getValue();
            case 374:
                return (DrawableResource) Drawable3_commonMainKt.V.getValue();
            case 375:
                return (DrawableResource) Drawable3_commonMainKt.V.getValue();
            case 376:
                return (DrawableResource) Drawable3_commonMainKt.W.getValue();
            case 377:
                return (DrawableResource) Drawable3_commonMainKt.X.getValue();
            case 378:
                return (DrawableResource) Drawable3_commonMainKt.Y.getValue();
            case 379:
                return (DrawableResource) Drawable3_commonMainKt.Z.getValue();
            case 380:
                return (DrawableResource) Drawable3_commonMainKt.a0.getValue();
            case 381:
                return (DrawableResource) Drawable3_commonMainKt.b0.getValue();
            case 382:
                return (DrawableResource) Drawable3_commonMainKt.c0.getValue();
            case 383:
                return (DrawableResource) Drawable3_commonMainKt.d0.getValue();
            case 384:
                return (DrawableResource) Drawable3_commonMainKt.e0.getValue();
            case 385:
                return (DrawableResource) Drawable3_commonMainKt.f0.getValue();
            case 386:
                return (DrawableResource) Drawable3_commonMainKt.g0.getValue();
            case 387:
                return (DrawableResource) Drawable3_commonMainKt.h0.getValue();
            case 388:
                return (DrawableResource) Drawable3_commonMainKt.j0.getValue();
            case 389:
                return (DrawableResource) Drawable3_commonMainKt.k0.getValue();
            case 390:
                return (DrawableResource) Drawable3_commonMainKt.l0.getValue();
            case 391:
                return (DrawableResource) Drawable3_commonMainKt.m0.getValue();
            case 392:
                return (DrawableResource) Drawable3_commonMainKt.n0.getValue();
            case 393:
                return (DrawableResource) Drawable3_commonMainKt.o0.getValue();
            case 394:
                return (DrawableResource) Drawable3_commonMainKt.p0.getValue();
            case 396:
                return (DrawableResource) Drawable3_commonMainKt.q0.getValue();
            case 398:
                return (DrawableResource) Drawable3_commonMainKt.r0.getValue();
            case 399:
                return (DrawableResource) Drawable3_commonMainKt.s0.getValue();
            case Constants.MINIMAL_ERROR_STATUS_CODE /* 400 */:
                return (DrawableResource) Drawable3_commonMainKt.t0.getValue();
            case TypedValues.CycleType.TYPE_CURVE_FIT /* 401 */:
                return (DrawableResource) Drawable3_commonMainKt.w0.getValue();
            case 402:
                return (DrawableResource) Drawable3_commonMainKt.x0.getValue();
            case TypedValues.CycleType.TYPE_ALPHA /* 403 */:
                return (DrawableResource) Drawable3_commonMainKt.y0.getValue();
            case WalletConstants.ERROR_CODE_INVALID_PARAMETERS /* 404 */:
                return (DrawableResource) Drawable3_commonMainKt.z0.getValue();
            case WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR /* 405 */:
                return (DrawableResource) Drawable3_commonMainKt.A0.getValue();
            case WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED /* 406 */:
                return (DrawableResource) Drawable3_commonMainKt.B0.getValue();
            case 407:
                return (DrawableResource) Drawable3_commonMainKt.C0.getValue();
            case WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR /* 409 */:
                return (DrawableResource) Drawable3_commonMainKt.D0.getValue();
            case WalletConstants.ERROR_CODE_INVALID_TRANSACTION /* 410 */:
                return (DrawableResource) Drawable3_commonMainKt.E0.getValue();
            case WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE /* 411 */:
                return (DrawableResource) Drawable3_commonMainKt.G0.getValue();
            case WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION /* 412 */:
                return (DrawableResource) Drawable3_commonMainKt.F0.getValue();
            case WalletConstants.ERROR_CODE_UNKNOWN /* 413 */:
                return (DrawableResource) Drawable1_commonMainKt.L0.getValue();
            case WalletConstants.ERROR_CODE_ILLEGAL_CALLER /* 414 */:
                return (DrawableResource) Drawable3_commonMainKt.H0.getValue();
            case WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE /* 415 */:
                return (DrawableResource) Drawable3_commonMainKt.I0.getValue();
            case 416:
                return (DrawableResource) Drawable3_commonMainKt.J0.getValue();
            case 417:
                return (DrawableResource) Drawable3_commonMainKt.K0.getValue();
            case 418:
                return (DrawableResource) Drawable3_commonMainKt.L0.getValue();
            case 419:
                return (DrawableResource) Drawable3_commonMainKt.M0.getValue();
            case TypedValues.CycleType.TYPE_EASING /* 420 */:
                return (DrawableResource) Drawable3_commonMainKt.N0.getValue();
            case 421:
                return (DrawableResource) Drawable3_commonMainKt.O0.getValue();
            case TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE /* 422 */:
                return (DrawableResource) Drawable3_commonMainKt.Q0.getValue();
            case TypedValues.CycleType.TYPE_WAVE_PERIOD /* 423 */:
                return (DrawableResource) Drawable3_commonMainKt.R0.getValue();
            case TypedValues.CycleType.TYPE_WAVE_OFFSET /* 424 */:
                return (DrawableResource) Drawable3_commonMainKt.S0.getValue();
            case TypedValues.CycleType.TYPE_WAVE_PHASE /* 425 */:
                return (DrawableResource) Drawable3_commonMainKt.P0.getValue();
            case 426:
                return (DrawableResource) Drawable3_commonMainKt.T0.getValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
