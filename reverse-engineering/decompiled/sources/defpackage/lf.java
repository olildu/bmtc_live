package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreenKt;
import app.chalo.ncmc.ui.common.CardRechargeTncDialogueKt;
import app.chalo.premiumbus.ui.bulkbookingsuccess.compose.PremiumBusBulkBookingSuccessMainScreenKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18308a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ int d;

    public /* synthetic */ lf(Modifier modifier, List list, int i, int i2) {
        this.f18308a = i2;
        this.c = modifier;
        this.b = list;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f18308a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                CardRechargeTncDialogueKt.b(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.c, this.b);
                break;
            case 1:
                NearbyStopsMapScreenKt.h(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.c, this.b);
                break;
            default:
                PremiumBusBulkBookingSuccessMainScreenKt.f(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.c, this.b);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ lf(List list, Modifier modifier, int i) {
        this.f18308a = 1;
        this.b = list;
        this.c = modifier;
        this.d = i;
    }
}
