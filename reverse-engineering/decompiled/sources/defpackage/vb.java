package defpackage;

import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.ui.semantics.SemanticsSortKt;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vb implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19820a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vb(Object obj, int i) {
        this.f19820a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f19820a) {
            case 0:
                return ((Number) ((n4) this.b).invoke(obj, obj2)).intValue();
            case 1:
                return ((Number) ((m3) this.b).invoke(obj, obj2)).intValue();
            case 2:
                return ((Number) ((m3) this.b).invoke(obj, obj2)).intValue();
            case 3:
                for (Function1 function1 : (Function1[]) this.b) {
                    int iA = ComparisonsKt.a((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (iA != 0) {
                        return iA;
                    }
                }
                return 0;
            case 4:
                return ((Number) ((tr) this.b).invoke(obj, obj2)).intValue();
            case 5:
                return ((Number) ((tr) this.b).invoke(obj, obj2)).intValue();
            case 6:
                return ((Comparator) this.b).compare(((PeekingIterator) obj).peek(), ((PeekingIterator) obj2).peek());
            case 7:
                return SelectionRegistrarImpl.sort$lambda$1((xm0) this.b, obj, obj2);
            default:
                return SemanticsSortKt.sortByGeometryGroupings$lambda$1((Function2) this.b, obj, obj2);
        }
    }
}
