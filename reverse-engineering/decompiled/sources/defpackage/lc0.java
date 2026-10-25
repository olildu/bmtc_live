package defpackage;

import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import in.juspay.hypersdk.core.JBridge;
import in.juspay.hypersdk.core.SdkTracker;
import j$.util.Objects;
import java.util.ArrayList;
import so.plotline.insights.Listeners.a;
import so.plotline.insights.Modal.i;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class lc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18301a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lc0(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f18301a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f18301a;
        Object obj = this.e;
        Object obj2 = this.d;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((JBridge) obj3).lambda$drawIcon$2(i2, (Drawable) obj2, (SdkTracker) obj);
                return;
            case 1:
                Uploader uploader = (Uploader) obj3;
                TransportContext transportContext = (TransportContext) obj2;
                Runnable runnable = (Runnable) obj;
                SynchronizationGuard synchronizationGuard = uploader.f;
                try {
                    try {
                        EventStore eventStore = uploader.c;
                        Objects.requireNonNull(eventStore);
                        synchronizationGuard.d(new os0(eventStore, 24));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) uploader.f13150a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            synchronizationGuard.d(new yw(uploader, transportContext, i2, 2));
                        } else {
                            uploader.a(transportContext, i2);
                        }
                        break;
                    } catch (SynchronizationException unused) {
                        uploader.d.b(transportContext, i2 + 1);
                        break;
                    }
                    return;
                } finally {
                    runnable.run();
                }
            default:
                int i3 = i.c;
                ArrayList arrayList = new ArrayList();
                arrayList.add(String.valueOf(i2));
                String str = ((i) obj3).b.b;
                ((a) obj2).c((Integer) obj, Boolean.FALSE, arrayList);
                return;
        }
    }

    public /* synthetic */ lc0(Uploader uploader, TransportContext transportContext, int i, Runnable runnable) {
        this.f18301a = 1;
        this.c = uploader;
        this.d = transportContext;
        this.b = i;
        this.e = runnable;
    }
}
