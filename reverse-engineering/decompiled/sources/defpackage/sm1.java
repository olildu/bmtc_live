package defpackage;

import app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent;
import app.chalo.scenes.ChaloNavigationManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sm1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19316a;
    public final /* synthetic */ UniversalPickerComponent b;

    public /* synthetic */ sm1(UniversalPickerComponent universalPickerComponent, int i) {
        this.f19316a = i;
        this.b = universalPickerComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ChaloNavigationManager chaloNavigationManager;
        switch (this.f19316a) {
            case 0:
                chaloNavigationManager = this.b.z;
                break;
            case 1:
                chaloNavigationManager = this.b.z;
                break;
            case 2:
                chaloNavigationManager = this.b.z;
                break;
            case 3:
                chaloNavigationManager = this.b.z;
                break;
            default:
                chaloNavigationManager = this.b.z;
                break;
        }
        gf.u(null, chaloNavigationManager);
        return Unit.f17538a;
    }
}
