package app.chalo.livetracking.frameworklivetracking.data.model.app;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RealtimeSocketResultKt {
    public static final boolean a(List list) {
        Intrinsics.i(list, "<this>");
        if (list.isEmpty()) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((RealtimeSocketEtaResponseAppModel) it.next()).b != -1) {
                return false;
            }
        }
        return true;
    }

    public static final boolean b(List list) {
        Intrinsics.i(list, "<this>");
        List<RealtimeSocketEtaResponseAppModel> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (RealtimeSocketEtaResponseAppModel realtimeSocketEtaResponseAppModel : list2) {
            if (((int) realtimeSocketEtaResponseAppModel.b) == -1 && ((int) realtimeSocketEtaResponseAppModel.d) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(List list) {
        Intrinsics.i(list, "<this>");
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((RealtimeSocketEtaResponseAppModel) it.next()).b >= 0) {
                return true;
            }
        }
        return false;
    }
}
