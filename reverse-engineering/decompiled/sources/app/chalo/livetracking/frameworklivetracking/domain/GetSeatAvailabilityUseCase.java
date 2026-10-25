package app.chalo.livetracking.frameworklivetracking.domain;

import app.chalo.Device;
import app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore;
import app.chalo.livetracking.frameworklivetracking.data.repository.LiveTrackingFrameworkRepository;
import app.chalo.providers.cityprovider.CityProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/domain/GetSeatAvailabilityUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetSeatAvailabilityUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f4328a;
    public final LiveTrackingConfigDataStore b;
    public final Device c;
    public final LiveTrackingFrameworkRepository d;

    public GetSeatAvailabilityUseCase(CityProvider cityProvider, LiveTrackingConfigDataStore liveTrackingConfigDataStore, Device device, LiveTrackingFrameworkRepository liveTrackingFrameworkRepository) {
        this.f4328a = cityProvider;
        this.b = liveTrackingConfigDataStore;
        this.c = device;
        this.d = liveTrackingFrameworkRepository;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b5 A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:13:0x0030, B:58:0x0114, B:20:0x004e, B:42:0x00b1, B:44:0x00b5, B:46:0x00bd, B:51:0x00d6, B:52:0x00e7, B:54:0x00ed, B:55:0x00fc, B:50:0x00d1, B:24:0x005e, B:34:0x008d, B:36:0x0091, B:38:0x0099, B:27:0x0065, B:30:0x006f), top: B:86:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:13:0x0030, B:58:0x0114, B:20:0x004e, B:42:0x00b1, B:44:0x00b5, B:46:0x00bd, B:51:0x00d6, B:52:0x00e7, B:54:0x00ed, B:55:0x00fc, B:50:0x00d1, B:24:0x005e, B:34:0x008d, B:36:0x0091, B:38:0x0099, B:27:0x0065, B:30:0x006f), top: B:86:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1 A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:13:0x0030, B:58:0x0114, B:20:0x004e, B:42:0x00b1, B:44:0x00b5, B:46:0x00bd, B:51:0x00d6, B:52:0x00e7, B:54:0x00ed, B:55:0x00fc, B:50:0x00d1, B:24:0x005e, B:34:0x008d, B:36:0x0091, B:38:0x0099, B:27:0x0065, B:30:0x006f), top: B:86:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed A[Catch: Exception -> 0x0035, LOOP:0: B:52:0x00e7->B:54:0x00ed, LOOP_END, TryCatch #0 {Exception -> 0x0035, blocks: (B:13:0x0030, B:58:0x0114, B:20:0x004e, B:42:0x00b1, B:44:0x00b5, B:46:0x00bd, B:51:0x00d6, B:52:0x00e7, B:54:0x00ed, B:55:0x00fc, B:50:0x00d1, B:24:0x005e, B:34:0x008d, B:36:0x0091, B:38:0x0099, B:27:0x0065, B:30:0x006f), top: B:86:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
    
        if (r0 == r3) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r19, java.util.List r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.frameworklivetracking.domain.GetSeatAvailabilityUseCase.a(int, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
