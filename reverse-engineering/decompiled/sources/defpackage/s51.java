package defpackage;

import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SearchBarState;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s51 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19272a;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ SearchBarState c;

    public /* synthetic */ s51(SearchBarState searchBarState, CoroutineScope coroutineScope) {
        this.f19272a = 0;
        this.c = searchBarState;
        this.b = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19272a) {
            case 0:
                return SearchBarDefaults.InputField$lambda$17$lambda$16(this.c, this.b);
            case 1:
                return SearchBarKt.DockedSearchBarLayout_nbWgWpA$lambda$51$lambda$50(this.b, this.c);
            case 2:
                return SearchBarKt.ExpandedFullScreenSearchBar__UtchM0$lambda$8$lambda$7(this.b, this.c);
            default:
                return SearchBarKt.ExpandedDockedSearchBar_qKj4JfE$lambda$13$lambda$12(this.b, this.c);
        }
    }

    public /* synthetic */ s51(CoroutineScope coroutineScope, SearchBarState searchBarState, int i) {
        this.f19272a = i;
        this.b = coroutineScope;
        this.c = searchBarState;
    }
}
