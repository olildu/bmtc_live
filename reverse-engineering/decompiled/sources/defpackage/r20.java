package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.instantticket.ui.faredetails.FareDetailsComponent;
import app.chalo.instantticket.ui.faredetails.compose.FareDetailsBaseComposableKt;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19172a;
    public final /* synthetic */ FareDetailsComponent b;
    public final /* synthetic */ InstantTicketWalletAccessComponent c;
    public final /* synthetic */ int d;

    public /* synthetic */ r20(FareDetailsComponent fareDetailsComponent, InstantTicketWalletAccessComponent instantTicketWalletAccessComponent, int i, int i2) {
        this.f19172a = i2;
        this.b = fareDetailsComponent;
        this.c = instantTicketWalletAccessComponent;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19172a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                FareDetailsBaseComposableKt.a(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            case 1:
                FareDetailsBaseComposableKt.a(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            default:
                FareDetailsBaseComposableKt.d(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
        }
        return Unit.f17538a;
    }
}
