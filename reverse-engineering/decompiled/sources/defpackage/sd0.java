package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sd0 implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19293a;
    public final /* synthetic */ Function3 b;

    public /* synthetic */ sd0(Function3 function3, int i) {
        this.f19293a = i;
        this.b = function3;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f19293a) {
            case 0:
                int iIntValue = ((Integer) obj4).intValue();
                return LazyGridIntervalContent.item$lambda$3(this.b, (LazyGridItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj4).intValue();
                return LazyListIntervalContent.item$lambda$2(this.b, (LazyItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj4).intValue();
                return LazyListScope.CC.t(this.b, (LazyItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj4).intValue();
                return LazyStaggeredGridIntervalContent.item$lambda$3(this.b, (LazyStaggeredGridItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, iIntValue4);
        }
    }
}
