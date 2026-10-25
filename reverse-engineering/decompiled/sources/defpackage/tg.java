package defpackage;

import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19654a;
    public final /* synthetic */ PBStopPlaceSelectedAppModel b;

    public /* synthetic */ tg(PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, int i) {
        this.f19654a = i;
        this.b = pBStopPlaceSelectedAppModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19654a) {
            case 0:
                ChaloBusViewState it = (ChaloBusViewState) obj;
                Intrinsics.i(it, "it");
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = this.b;
                return ChaloBusViewState.a(it, null, false, 0, null, null, null, pBStopPlaceSelectedAppModel, null, Intrinsics.d(pBStopPlaceSelectedAppModel.b, "userLocation"), null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268433151);
            case 1:
                ChaloBusViewState it2 = (ChaloBusViewState) obj;
                Intrinsics.i(it2, "it");
                return ChaloBusViewState.a(it2, null, false, 0, null, null, null, null, this.b, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268434943);
            default:
                ChaloBusViewState chaloBusViewState = (ChaloBusViewState) obj;
                return chaloBusViewState.h != null ? chaloBusViewState : ChaloBusViewState.a(chaloBusViewState, null, false, 0, null, null, null, this.b, null, true, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268433151);
        }
    }
}
