package defpackage;

import app.chalo.home.ui.profile.ProfileScreenComponent;
import app.chalo.home.ui.profile.ProfileScreenViewIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dy0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15501a;
    public final /* synthetic */ ProfileScreenComponent b;

    public /* synthetic */ dy0(ProfileScreenComponent profileScreenComponent, int i) {
        this.f15501a = i;
        this.b = profileScreenComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15501a) {
            case 0:
                return this.b.k.d();
            default:
                this.b.H0(ProfileScreenViewIntent.CloseEnvironmentChangeDialog.f3606a);
                return Unit.f17538a;
        }
    }
}
