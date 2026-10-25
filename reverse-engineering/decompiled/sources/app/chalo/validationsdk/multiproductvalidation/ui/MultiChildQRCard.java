package app.chalo.validationsdk.multiproductvalidation.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiChildQRCard;", "", "MultiProductQrUIState", "MultiProductExpiredQrUIState", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiChildQRCard$MultiProductExpiredQrUIState;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiChildQRCard$MultiProductQrUIState;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MultiChildQRCard {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiChildQRCard$MultiProductExpiredQrUIState;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiChildQRCard;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultiProductExpiredQrUIState extends MultiChildQRCard {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExpiredQrTicketUIState f10684a;
        public final ChaloPadding b;

        public MultiProductExpiredQrUIState(ExpiredQrTicketUIState expiredState) {
            ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 0.0f, ChaloThemeHelper.a().h, 7);
            Intrinsics.i(expiredState, "expiredState");
            this.f10684a = expiredState;
            this.b = chaloPadding;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiProductExpiredQrUIState)) {
                return false;
            }
            MultiProductExpiredQrUIState multiProductExpiredQrUIState = (MultiProductExpiredQrUIState) obj;
            return Intrinsics.d(this.f10684a, multiProductExpiredQrUIState.f10684a) && Intrinsics.d(this.b, multiProductExpiredQrUIState.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10684a.hashCode() * 31);
        }

        public final String toString() {
            return "MultiProductExpiredQrUIState(expiredState=" + this.f10684a + ", paddingAround=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiChildQRCard$MultiProductQrUIState;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiChildQRCard;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultiProductQrUIState extends MultiChildQRCard {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10685a;
        public final TextUIState b;
        public final TextUIState.ChaloTextUIState c;
        public final TextUIState.ChaloTextUIState d;
        public final ChaloPadding e;
        public final ChaloPadding f;
        public final float g;
        public final ChaloColorToken h;
        public final UIShape i;
        public final UiEventHandler$Companion$fromLambda$1 j;

        public MultiProductQrUIState(String qrCode, TextUIState textUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
            float fM7278constructorimpl = Dp.m7278constructorimpl(ChaloThemeHelper.a().h + ChaloThemeHelper.a().d);
            float f = ChaloThemeHelper.a().i;
            ChaloPadding chaloPadding = new ChaloPadding(fM7278constructorimpl, f, f, fM7278constructorimpl);
            ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, ChaloThemeHelper.a().i, 1);
            UIShape.Rectangle shape = UIShape.e;
            Intrinsics.i(qrCode, "qrCode");
            Intrinsics.i(shape, "shape");
            this.f10685a = qrCode;
            this.b = textUIState;
            this.c = chaloTextUIState;
            this.d = chaloTextUIState2;
            this.e = chaloPadding;
            this.f = chaloPadding2;
            this.g = 0.75f;
            this.h = ChaloColorToken.White.f9870a;
            this.i = shape;
            this.j = uiEventHandler$Companion$fromLambda$1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiProductQrUIState)) {
                return false;
            }
            MultiProductQrUIState multiProductQrUIState = (MultiProductQrUIState) obj;
            return Intrinsics.d(this.f10685a, multiProductQrUIState.f10685a) && Intrinsics.d(this.b, multiProductQrUIState.b) && Intrinsics.d(this.c, multiProductQrUIState.c) && Intrinsics.d(this.d, multiProductQrUIState.d) && Intrinsics.d(this.e, multiProductQrUIState.e) && Intrinsics.d(this.f, multiProductQrUIState.f) && Float.compare(this.g, multiProductQrUIState.g) == 0 && Intrinsics.d(this.h, multiProductQrUIState.h) && Intrinsics.d(this.i, multiProductQrUIState.i) && Intrinsics.d(this.j, multiProductQrUIState.j);
        }

        public final int hashCode() {
            int iHashCode = this.f10685a.hashCode() * 31;
            TextUIState textUIState = this.b;
            return this.j.hashCode() + pk0.b(this.i, z40.b(this.h, r30.a(this.g, r30.c(this.f, r30.c(this.e, r30.f(this.d, r30.f(this.c, (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MultiProductQrUIState(qrCode=");
            sb.append(this.f10685a);
            sb.append(", ticketNumber=");
            sb.append(this.b);
            sb.append(", heading=");
            r30.p(sb, this.c, ", message=", this.d, ", internalPadding=");
            r30.o(sb, this.e, ", paddingAroundQR=", this.f, ", qrWidthFillRatio=");
            sb.append(this.g);
            sb.append(", background=");
            sb.append(this.h);
            sb.append(", shape=");
            sb.append(this.i);
            sb.append(", qrClickEventHandler=");
            sb.append(this.j);
            sb.append(")");
            return sb.toString();
        }
    }
}
