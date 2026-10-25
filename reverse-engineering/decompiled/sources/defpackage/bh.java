package defpackage;

import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.ncmc.ui.pendingrecharge.PendingRechargeDataState;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationDataState;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bh implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11197a;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ bh(int i, List list, boolean z) {
        this.f11197a = i;
        this.b = list;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11197a) {
            case 0:
                ChaloBusViewState it = (ChaloBusViewState) obj;
                Intrinsics.i(it, "it");
                return ChaloBusViewState.a(it, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, this.c, this.b, false, null, null, null, null, 262143999);
            case 1:
                MultiProductValidationDataState it2 = (MultiProductValidationDataState) obj;
                Intrinsics.i(it2, "it");
                return MultiProductValidationDataState.a(it2, this.b, null, null, this.c, 13);
            default:
                return PendingRechargeDataState.a((PendingRechargeDataState) obj, false, this.b, this.c, 1);
        }
    }

    public /* synthetic */ bh(boolean z, List list) {
        this.f11197a = 0;
        this.c = z;
        this.b = list;
    }
}
