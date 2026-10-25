package defpackage;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yw implements ListenerSet.Event, SynchronizationGuard.CriticalSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20147a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yw(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        this.f20147a = 1;
        this.b = i;
        this.c = positionInfo;
        this.d = positionInfo2;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        Uploader uploader = (Uploader) this.c;
        uploader.d.b((TransportContext) this.d, this.b + 1);
        return null;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f20147a) {
            case 0:
                ((AnalyticsListener) obj).onMediaItemTransition((AnalyticsListener.EventTime) this.c, (MediaItem) this.d, this.b);
                break;
            default:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$33(this.b, (Player.PositionInfo) this.c, (Player.PositionInfo) this.d, (Player.Listener) obj);
                break;
        }
    }

    public /* synthetic */ yw(Object obj, Object obj2, int i, int i2) {
        this.f20147a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
