package defpackage;

import android.graphics.RectF;
import android.util.Pair;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.checkout.ui.screen.payment.PaymentDataState;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.instantticket.ui.faredetails.contract.UserBillingDataState;
import app.chalo.instantticket.ui.faredetails.contract.UserBillingInfoBottomSheetState;
import app.chalo.ncmc.ui.cardlinking.linking.CardLinkingErrorType;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkViewState;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsViewState;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Models.h;
import so.plotline.insights.Plotline;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ui implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19748a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ui(String str, boolean z, int i) {
        this.f19748a = i;
        this.b = str;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19748a) {
            case 0:
                ChaloCardLinkViewState it = (ChaloCardLinkViewState) obj;
                Intrinsics.i(it, "it");
                return ChaloCardLinkViewState.a(it, null, this.b, this.c, false, CardLinkingErrorType.NO_ERROR, false, null, null, 0, 0, 0, 0, false, 8169);
            case 1:
                ChaloCardLinkViewState it2 = (ChaloCardLinkViewState) obj;
                Intrinsics.i(it2, "it");
                return ChaloCardLinkViewState.a(it2, this.b, null, this.c, false, CardLinkingErrorType.NO_ERROR, false, null, null, 0, 0, 0, 0, false, 8170);
            case 2:
                EnterCardDetailsViewState it3 = (EnterCardDetailsViewState) obj;
                Intrinsics.i(it3, "it");
                return EnterCardDetailsViewState.a(it3, null, this.b, null, null, false, this.c, false, false, false, null, false, 4027);
            case 3:
                FareDetailsViewState it4 = (FareDetailsViewState) obj;
                Intrinsics.i(it4, "it");
                return FareDetailsViewState.a(it4, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, UserBillingInfoBottomSheetState.a(it4.z, null, new UserBillingDataState(this.b, this.c), 13), null, null, false, null, false, null, null, null, null, null, null, -33554433, 31);
            case 4:
                FareDetailsViewState it5 = (FareDetailsViewState) obj;
                Intrinsics.i(it5, "it");
                return FareDetailsViewState.a(it5, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, UserBillingInfoBottomSheetState.a(it5.z, new UserBillingDataState(this.b, this.c), null, 14), null, null, false, null, false, null, null, null, null, null, null, -33554433, 31);
            case 5:
                return PaymentDataState.a((PaymentDataState) obj, null, false, null, false, null, null, false, null, null, null, null, false, false, false, null, this.c, this.b, 524287);
            case 6:
                String str = this.b;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                Intrinsics.i(layoutCoordinates, "layoutCoordinates");
                float fIntBitsToFloat = Float.intBitsToFloat((int) (LayoutCoordinatesKt.positionInWindow(layoutCoordinates) >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (LayoutCoordinatesKt.positionInWindow(layoutCoordinates) & BodyPartID.bodyIdMax));
                RectF rectF = new RectF(fIntBitsToFloat, fIntBitsToFloat2, ((int) (layoutCoordinates.mo5941getSizeYbymL2g() >> 32)) + fIntBitsToFloat, ((int) (BodyPartID.bodyIdMax & layoutCoordinates.mo5941getSizeYbymL2g())) + fIntBitsToFloat2);
                try {
                    if (!Plotline.b().f.booleanValue()) {
                        HashMap map = Plotline.b().Y;
                        Pair pair = new Pair(Plotline.b().V, str);
                        Long lValueOf = Long.valueOf(System.currentTimeMillis());
                        h hVar = new h();
                        hVar.c = "";
                        hVar.b = rectF;
                        hVar.f19501a = lValueOf;
                        map.put(pair, hVar);
                    }
                    break;
                } catch (Exception e) {
                    DebugHelper.a(e);
                }
                if (this.c) {
                    Plotline.b().Z.add(str);
                }
                return Unit.f17538a;
            default:
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.b(0, Boolean.valueOf(this.c));
                execute.bindString(1, this.b);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ ui(boolean z, String str, int i) {
        this.f19748a = i;
        this.c = z;
        this.b = str;
    }
}
