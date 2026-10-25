package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.branding.ProductBookingBrandingUIState;
import app.chalo.uistate.components.ValidationProductInfoUIState;
import app.chalo.uistate.divider.DashedDividerUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationScreenUIState;", "", "QRZoomed", "QRWithProductAndUserDetails", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationScreenUIState$QRWithProductAndUserDetails;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationScreenUIState$QRZoomed;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class QRValidationScreenUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10650a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationScreenUIState$QRWithProductAndUserDetails;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationScreenUIState;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QRWithProductAndUserDetails extends QRValidationScreenUIState {
        public final QRWithProductAndUserDetailsUISpec b;
        public final List c;
        public final List d;
        public final ProductBookingBrandingUIState e;
        public final ProductBookingBrandingUIState f;
        public final TextUIState g;
        public final TextUIState h;
        public final TextUIState i;
        public final DashedDividerUIState j;
        public final ValidationProductInfoUIState.ValidationUserDetailsUIState k;
        public final DividerUIState l;
        public final List m;
        public final ValidationTripDetailsUIState n;
        public final ImageUIState o;
        public final ViewJourneyUIState p;
        public final TextWithLeftAndRightIconUIState q;
        public final SwitchToBLECalloutUIState r;
        public final boolean s;
        public final boolean t;
        public final DividerUIState u;

        public QRWithProductAndUserDetails(List ticketValidationInfoList, List ticketGridItemUIState, ProductBookingBrandingUIState productBookingBrandingUIState, ProductBookingBrandingUIState productBookingBrandingUIState2, TextUIState textUIState, TextUIState.ChaloTextUIState tapQrCode, TextUIState.ChaloTextUIState passValidityTime, ValidationProductInfoUIState.ValidationUserDetailsUIState validationUserDetailsUIState, List additionalInfo, ValidationTripDetailsUIState validationTripDetailsUIState, ImageUIState imageUIState, ViewJourneyUIState viewJourneyUIState, TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState, SwitchToBLECalloutUIState switchToBLECalloutUIState, boolean z, boolean z2) {
            QRWithProductAndUserDetailsUISpec qRWithProductAndUserDetailsUISpec = new QRWithProductAndUserDetailsUISpec();
            DashedDividerUIState dashedDividerUIState = new DashedDividerUIState(0.0f, 15, null);
            DividerUIState dividerUIState = new DividerUIState(0.0f, null, null, 7);
            DividerUIState dividerUIState2 = new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.LightGrey.f9815a, null, 4);
            Intrinsics.i(ticketValidationInfoList, "ticketValidationInfoList");
            Intrinsics.i(ticketGridItemUIState, "ticketGridItemUIState");
            Intrinsics.i(tapQrCode, "tapQrCode");
            Intrinsics.i(passValidityTime, "passValidityTime");
            Intrinsics.i(additionalInfo, "additionalInfo");
            Intrinsics.i(viewJourneyUIState, "viewJourneyUIState");
            super(z);
            this.b = qRWithProductAndUserDetailsUISpec;
            this.c = ticketValidationInfoList;
            this.d = ticketGridItemUIState;
            this.e = productBookingBrandingUIState;
            this.f = productBookingBrandingUIState2;
            this.g = textUIState;
            this.h = tapQrCode;
            this.i = passValidityTime;
            this.j = dashedDividerUIState;
            this.k = validationUserDetailsUIState;
            this.l = dividerUIState;
            this.m = additionalInfo;
            this.n = validationTripDetailsUIState;
            this.o = imageUIState;
            this.p = viewJourneyUIState;
            this.q = textWithLeftAndRightIconUIState;
            this.r = switchToBLECalloutUIState;
            this.s = z;
            this.t = z2;
            this.u = dividerUIState2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QRWithProductAndUserDetails)) {
                return false;
            }
            QRWithProductAndUserDetails qRWithProductAndUserDetails = (QRWithProductAndUserDetails) obj;
            return Intrinsics.d(this.b, qRWithProductAndUserDetails.b) && Intrinsics.d(this.c, qRWithProductAndUserDetails.c) && Intrinsics.d(this.d, qRWithProductAndUserDetails.d) && Intrinsics.d(this.e, qRWithProductAndUserDetails.e) && Intrinsics.d(this.f, qRWithProductAndUserDetails.f) && Intrinsics.d(this.g, qRWithProductAndUserDetails.g) && Intrinsics.d(this.h, qRWithProductAndUserDetails.h) && Intrinsics.d(this.i, qRWithProductAndUserDetails.i) && Intrinsics.d(this.j, qRWithProductAndUserDetails.j) && Intrinsics.d(this.k, qRWithProductAndUserDetails.k) && Intrinsics.d(this.l, qRWithProductAndUserDetails.l) && Intrinsics.d(this.m, qRWithProductAndUserDetails.m) && Intrinsics.d(this.n, qRWithProductAndUserDetails.n) && Intrinsics.d(this.o, qRWithProductAndUserDetails.o) && Intrinsics.d(this.p, qRWithProductAndUserDetails.p) && Intrinsics.d(this.q, qRWithProductAndUserDetails.q) && Intrinsics.d(this.r, qRWithProductAndUserDetails.r) && this.s == qRWithProductAndUserDetails.s && this.t == qRWithProductAndUserDetails.t && Intrinsics.d(this.u, qRWithProductAndUserDetails.u);
        }

        public final int hashCode() {
            int iB = r30.b(r30.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
            ProductBookingBrandingUIState productBookingBrandingUIState = this.e;
            int iHashCode = (iB + (productBookingBrandingUIState == null ? 0 : productBookingBrandingUIState.hashCode())) * 31;
            ProductBookingBrandingUIState productBookingBrandingUIState2 = this.f;
            int iHashCode2 = (iHashCode + (productBookingBrandingUIState2 == null ? 0 : productBookingBrandingUIState2.hashCode())) * 31;
            TextUIState textUIState = this.g;
            int iHashCode3 = (this.j.hashCode() + pk0.c(this.i, pk0.c(this.h, (iHashCode2 + (textUIState == null ? 0 : textUIState.hashCode())) * 31, 31), 31)) * 31;
            ValidationProductInfoUIState.ValidationUserDetailsUIState validationUserDetailsUIState = this.k;
            int iB2 = r30.b(py.c(this.l, (iHashCode3 + (validationUserDetailsUIState == null ? 0 : validationUserDetailsUIState.hashCode())) * 31, 31), 31, this.m);
            ValidationTripDetailsUIState validationTripDetailsUIState = this.n;
            int iHashCode4 = (iB2 + (validationTripDetailsUIState == null ? 0 : validationTripDetailsUIState.hashCode())) * 31;
            ImageUIState imageUIState = this.o;
            int iHashCode5 = (this.p.hashCode() + ((iHashCode4 + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31)) * 31;
            TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState = this.q;
            int iHashCode6 = (iHashCode5 + (textWithLeftAndRightIconUIState == null ? 0 : textWithLeftAndRightIconUIState.hashCode())) * 31;
            SwitchToBLECalloutUIState switchToBLECalloutUIState = this.r;
            return this.u.hashCode() + ((((((iHashCode6 + (switchToBLECalloutUIState != null ? switchToBLECalloutUIState.hashCode() : 0)) * 31) + (this.s ? 1231 : 1237)) * 31) + (this.t ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            return "QRWithProductAndUserDetails(specs=" + this.b + ", ticketValidationInfoList=" + this.c + ", ticketGridItemUIState=" + this.d + ", topProductBranding=" + this.e + ", bottomProductBranding=" + this.f + ", qrUpdateTs=" + this.g + ", tapQrCode=" + this.h + ", passValidityTime=" + this.i + ", dottedDivider=" + this.j + ", userDetails=" + this.k + ", divider=" + this.l + ", additionalInfo=" + this.m + ", tripDetails=" + this.n + ", animatingBusImage=" + this.o + ", viewJourneyUIState=" + this.p + ", viewDetailsUIState=" + this.q + ", switchToBLECalloutUIState=" + this.r + ", showQrScreenLoadingDialogue=" + this.s + ", shouldShowViewJourneyButton=" + this.t + ", viewDetailsDivider=" + this.u + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationScreenUIState$QRZoomed;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationScreenUIState;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QRZoomed extends QRValidationScreenUIState {
        public final String b;
        public final ChaloPadding c;

        public QRZoomed(String str) {
            float f = ChaloThemeHelper.a().f;
            float f2 = ChaloThemeHelper.a().r;
            ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
            super(false);
            this.b = str;
            this.c = chaloPadding;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QRZoomed)) {
                return false;
            }
            QRZoomed qRZoomed = (QRZoomed) obj;
            return Intrinsics.d(this.b, qRZoomed.b) && Intrinsics.d(this.c, qRZoomed.c);
        }

        public final int hashCode() {
            String str = this.b;
            return ((this.c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31) + 1237;
        }

        public final String toString() {
            return "QRZoomed(qrCodeData=" + this.b + ", paddingAroundQR=" + this.c + ", showZoomedScreenLoadingDialogue=false)";
        }
    }

    public QRValidationScreenUIState(boolean z) {
        this.f10650a = z;
    }
}
