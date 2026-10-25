package defpackage;

import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionLayoutType;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ap implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f694a;
    public final /* synthetic */ CityLocationSelectionLayoutType b;

    public /* synthetic */ ap(CityLocationSelectionLayoutType cityLocationSelectionLayoutType, int i) {
        this.f694a = i;
        this.b = cityLocationSelectionLayoutType;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f694a) {
            case 0:
                CityLocationSelectionState it = (CityLocationSelectionState) obj;
                Intrinsics.i(it, "it");
                return CityLocationSelectionState.a(it, false, null, this.b, null, null, null, null, false, null, false, 2042);
            default:
                return CityLocationSelectionState.a((CityLocationSelectionState) obj, false, null, this.b, null, null, null, null, false, null, false, 2042);
        }
    }
}
