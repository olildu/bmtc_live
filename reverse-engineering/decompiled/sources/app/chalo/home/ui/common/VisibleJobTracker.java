package app.chalo.home.ui.common;

import defpackage.ol1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/common/VisibleJobTracker;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VisibleJobTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f3386a = new LinkedHashSet();

    public final void a() {
        LinkedHashSet linkedHashSet = this.f3386a;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        List listD0 = CollectionsKt.D0(linkedHashSet);
        linkedHashSet.clear();
        Iterator it = listD0.iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel(null);
        }
    }

    public final void b(Job job) {
        this.f3386a.add(job);
        ((JobSupport) job).w(new ol1(8, this, job));
    }
}
