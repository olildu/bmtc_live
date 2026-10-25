package app.chalo.livetracking.frameworklivetracking.domain;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/domain/InvalidGpsLocationData;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InvalidGpsLocationData extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InvalidGpsLocationData f4329a = new InvalidGpsLocationData();

    private InvalidGpsLocationData() {
        super("Invalid GPS location data");
    }
}
