package defpackage;

import androidx.compose.foundation.lazy.layout.PrefetchRequest;
import androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class dx0 {
    public static void a(PriorityPrefetchScheduler priorityPrefetchScheduler, PrefetchRequest prefetchRequest) {
        priorityPrefetchScheduler.scheduleHighPriorityPrefetch(prefetchRequest);
    }
}
