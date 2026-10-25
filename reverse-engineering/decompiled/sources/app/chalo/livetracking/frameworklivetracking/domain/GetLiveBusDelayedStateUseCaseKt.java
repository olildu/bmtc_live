package app.chalo.livetracking.frameworklivetracking.domain;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GetLiveBusDelayedStateUseCaseKt {
    public static final long a(long j, long j2) {
        return ((j - j2) / ((long) 1000)) / ((long) 60);
    }
}
