package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.ChaloGridLayoutKt;
import app.chalo.compose.components.divider.TicketPunchDividerKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.uistate.base.ChaloColorToken;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17505a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ kk(Modifier modifier, ChaloColorToken chaloColorToken, float f, float f2, int i, int i2) {
        this.f17505a = 2;
        this.f = modifier;
        this.g = chaloColorToken;
        this.c = f;
        this.d = f2;
        this.b = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17505a) {
            case 0:
                ((Integer) obj2).getClass();
                ChaloGridLayoutKt.b((Modifier) this.f, (ArrayList) this.g, this.b, this.c, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                PbBulkBookingRideDetailsScreenKt.b((String) this.f, (String) this.g, this.b, this.c, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                TicketPunchDividerKt.a((Modifier) this.f, (ChaloColorToken) this.g, this.c, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1), this.e);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ kk(Object obj, Serializable serializable, int i, float f, float f2, int i2, int i3) {
        this.f17505a = i3;
        this.f = obj;
        this.g = serializable;
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = i2;
    }
}
