package defpackage;

import app.chalo.home.ui.home.HomeScreenViewState;
import app.chalo.home.ui.profile.ProfileDrawerCardData;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11262a;
    public final /* synthetic */ ProfileDrawerCardData b;

    public /* synthetic */ c80(ProfileDrawerCardData profileDrawerCardData, int i) {
        this.f11262a = i;
        this.b = profileDrawerCardData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11262a) {
            case 0:
                return HomeScreenViewState.a((HomeScreenViewState) obj, this.b, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, false, 524286);
            default:
                return RegularBusViewState.a((RegularBusViewState) obj, false, null, null, null, false, null, null, null, null, this.b, null, null, null, null, null, null, null, false, false, false, false, 4193279);
        }
    }
}
