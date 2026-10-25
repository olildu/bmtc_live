package defpackage;

import app.chalo.home.ui.regularbus.RegularBusComponent;
import app.chalo.home.ui.regularbus.RegularBusViewIntent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i11 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15875a;
    public final /* synthetic */ RegularBusComponent b;

    public /* synthetic */ i11(RegularBusComponent regularBusComponent, int i) {
        this.f15875a = i;
        this.b = regularBusComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15875a) {
            case 0:
                return new i11(this.b, 1);
            default:
                this.b.Z0(RegularBusViewIntent.MapClickedIntent.f3644a);
                return Boolean.FALSE;
        }
    }
}
