package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.internal.MutableWindowInsets;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y41 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20075a;
    public final /* synthetic */ MutableWindowInsets b;
    public final /* synthetic */ WindowInsets c;

    public /* synthetic */ y41(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets, int i) {
        this.f20075a = i;
        this.b = mutableWindowInsets;
        this.c = windowInsets;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20075a) {
            case 0:
                return ScaffoldKt.Scaffold_TvnljyQ$lambda$2$lambda$1(this.b, this.c, (WindowInsets) obj);
            case 1:
                return SearchBarKt.FullScreenSearchBarLayout_EQC0FA8$lambda$65$lambda$64(this.b, this.c, (WindowInsets) obj);
            default:
                return SearchBarKt.SearchBarLayout$lambda$42$lambda$41(this.b, this.c, (WindowInsets) obj);
        }
    }
}
