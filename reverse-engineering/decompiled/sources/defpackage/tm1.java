package defpackage;

import app.chalo.livetracking.universalsearch.ui.SearchScreenLayoutType;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerViewState;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tm1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19672a;
    public final /* synthetic */ UniversalPickerComponent b;

    public /* synthetic */ tm1(UniversalPickerComponent universalPickerComponent, int i) {
        this.f19672a = i;
        this.b = universalPickerComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UniversalPickerViewState it = (UniversalPickerViewState) obj;
        switch (this.f19672a) {
            case 0:
                Intrinsics.i(it, "it");
                EmptyList emptyList = EmptyList.f17557a;
                SearchScreenLayoutType searchScreenLayoutType = ((UniversalPickerViewState) this.b.f.getValue()).f;
                SearchScreenLayoutType searchScreenLayoutType2 = SearchScreenLayoutType.RECENT_AND_FAVORITE_SCREEN;
                if (searchScreenLayoutType != searchScreenLayoutType2) {
                    searchScreenLayoutType2 = SearchScreenLayoutType.RECENT_RESULT_SCREEN;
                }
                return UniversalPickerViewState.a(it, null, emptyList, null, false, false, searchScreenLayoutType2, null, false, false, false, null, null, null, null, null, null, false, null, false, false, null, null, null, 8388445);
            case 1:
                Intrinsics.i(it, "it");
                return UniversalPickerViewState.a(it, null, null, null, !((UniversalPickerViewState) this.b.f.getValue()).d, false, null, null, false, false, false, null, null, null, null, null, null, false, null, false, false, null, null, null, 8388599);
            default:
                Intrinsics.i(it, "it");
                return UniversalPickerViewState.a(it, ((UniversalPickerViewState) this.b.f.getValue()).f5084a, null, null, false, false, SearchScreenLayoutType.RECENT_RESULT_SCREEN, null, false, false, true, "", null, null, null, null, null, false, null, false, false, null, null, null, 8386910);
        }
    }
}
