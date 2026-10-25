package app.chalo.validationsdk.multiproductvalidation.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationScreenUIState;", "", "Loading", "Content", "ZoomedQr", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationScreenUIState$Content;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationScreenUIState$Loading;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationScreenUIState$ZoomedQr;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MultiProductValidationScreenUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationScreenUIState$Content;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationScreenUIState;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content extends MultiProductValidationScreenUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState f10700a;
        public final TextUIState b;
        public final float c;
        public final List d;
        public final BrandingFooterUIState e;
        public final float f;
        public final ChaloPadding g;

        public Content(TextUIState expirySummary, TextUIState textUIState, List childCards, BrandingFooterUIState brandingFooterUIState) {
            float fM7278constructorimpl = Dp.m7278constructorimpl(ChaloThemeHelper.a().h + ChaloThemeHelper.a().d);
            float f = ChaloThemeHelper.a().h;
            ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 0.0f, 0.0f, 14);
            Intrinsics.i(expirySummary, "expirySummary");
            Intrinsics.i(childCards, "childCards");
            this.f10700a = expirySummary;
            this.b = textUIState;
            this.c = fM7278constructorimpl;
            this.d = childCards;
            this.e = brandingFooterUIState;
            this.f = f;
            this.g = chaloPadding;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.d(this.f10700a, content.f10700a) && Intrinsics.d(this.b, content.b) && Dp.m7283equalsimpl0(this.c, content.c) && Intrinsics.d(this.d, content.d) && Intrinsics.d(this.e, content.e) && Dp.m7283equalsimpl0(this.f, content.f) && Intrinsics.d(this.g, content.g);
        }

        public final int hashCode() {
            int iHashCode = this.f10700a.hashCode() * 31;
            TextUIState textUIState = this.b;
            int iB = r30.b(uf0.a(this.c, (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31, 31), 31, this.d);
            BrandingFooterUIState brandingFooterUIState = this.e;
            return this.g.hashCode() + uf0.a(this.f, (iB + (brandingFooterUIState != null ? brandingFooterUIState.hashCode() : 0)) * 31, 31);
        }

        public final String toString() {
            String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
            String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.f);
            StringBuilder sb = new StringBuilder("Content(expirySummary=");
            sb.append(this.f10700a);
            sb.append(", passengerSummary=");
            sb.append(this.b);
            sb.append(", spaceAboveChildCards=");
            pk0.w(strM7289toStringimpl, ", childCards=", ", brandingFooter=", sb, this.d);
            sb.append(this.e);
            sb.append(", spaceBetweenChildCards=");
            sb.append(strM7289toStringimpl2);
            sb.append(", paddingAroundPassengerSummary=");
            return py.e(sb, this.g, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationScreenUIState$Loading;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationScreenUIState;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading extends MultiProductValidationScreenUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f10701a = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -646687700;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationScreenUIState$ZoomedQr;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationScreenUIState;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ZoomedQr extends MultiProductValidationScreenUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10702a;
        public final ChaloPadding b;

        public ZoomedQr(String str) {
            float f = ChaloThemeHelper.a().f;
            ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
            this.f10702a = str;
            this.b = chaloPadding;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZoomedQr)) {
                return false;
            }
            ZoomedQr zoomedQr = (ZoomedQr) obj;
            return Intrinsics.d(this.f10702a, zoomedQr.f10702a) && Intrinsics.d(this.b, zoomedQr.b);
        }

        public final int hashCode() {
            String str = this.f10702a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "ZoomedQr(qrCode=" + this.f10702a + ", paddingAround=" + this.b + ")";
        }
    }
}
