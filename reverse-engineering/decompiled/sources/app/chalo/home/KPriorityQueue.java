package app.chalo.home;

import java.lang.Comparable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/KPriorityQueue;", "", "T", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KPriorityQueue<T extends Comparable<? super T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2861a = new ArrayList();

    public final Comparable a() {
        ArrayList arrayList = this.f2861a;
        if (arrayList.isEmpty()) {
            return null;
        }
        Comparable comparable = (Comparable) CollectionsKt.F(arrayList);
        Comparable comparable2 = (Comparable) arrayList.remove(arrayList.size() - 1);
        if (!arrayList.isEmpty()) {
            int i = 0;
            arrayList.set(0, comparable2);
            Comparable comparable3 = (Comparable) arrayList.get(0);
            int size = arrayList.size();
            while (true) {
                int i2 = i * 2;
                int i3 = i2 + 1;
                int i4 = i2 + 2;
                if (i3 >= size || ((Comparable) arrayList.get(i3)).compareTo(arrayList.get(i)) >= 0) {
                    i3 = i;
                }
                if (i4 >= size || ((Comparable) arrayList.get(i4)).compareTo(arrayList.get(i3)) >= 0) {
                    i4 = i3;
                }
                if (i4 == i) {
                    break;
                }
                arrayList.set(i, arrayList.get(i4));
                i = i4;
            }
            arrayList.set(i, comparable3);
        }
        return comparable;
    }
}
