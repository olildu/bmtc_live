package app.chalo.features.foreground;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/foreground/ApplicationForegroundManagerAndroid;", "Lapp/chalo/features/foreground/ApplicationForegroundManager;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ApplicationForegroundManagerAndroid implements ApplicationForegroundManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f2712a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();

    public ApplicationForegroundManagerAndroid(Context context) {
        Context applicationContext = context.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: app.chalo.features.foreground.ApplicationForegroundManagerAndroid.1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    Intrinsics.i(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                    Intrinsics.i(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                    List listD0;
                    Intrinsics.i(activity, "activity");
                    boolean z = ApplicationForegroundManagerAndroid.this.f2712a;
                    ApplicationForegroundManagerAndroid.this.f2712a = false;
                    if (z) {
                        ApplicationForegroundManagerAndroid applicationForegroundManagerAndroid = ApplicationForegroundManagerAndroid.this;
                        synchronized (applicationForegroundManagerAndroid.b) {
                            listD0 = CollectionsKt.D0(applicationForegroundManagerAndroid.c);
                        }
                        Iterator it = listD0.iterator();
                        while (it.hasNext()) {
                            ((ForegroundListener) it.next()).a();
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                    List listD0;
                    Intrinsics.i(activity, "activity");
                    boolean z = ApplicationForegroundManagerAndroid.this.f2712a;
                    ApplicationForegroundManagerAndroid.this.f2712a = true;
                    if (z) {
                        return;
                    }
                    ApplicationForegroundManagerAndroid applicationForegroundManagerAndroid = ApplicationForegroundManagerAndroid.this;
                    synchronized (applicationForegroundManagerAndroid.b) {
                        listD0 = CollectionsKt.D0(applicationForegroundManagerAndroid.c);
                    }
                    Iterator it = listD0.iterator();
                    while (it.hasNext()) {
                        ((ForegroundListener) it.next()).b();
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                    Intrinsics.i(activity, "activity");
                    Intrinsics.i(outState, "outState");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                    Intrinsics.i(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                    Intrinsics.i(activity, "activity");
                }
            });
        }
    }

    @Override // app.chalo.features.foreground.ApplicationForegroundManager
    public final void a(ForegroundListener listener) {
        Intrinsics.i(listener, "listener");
        synchronized (this.b) {
            this.c.add(listener);
        }
    }

    @Override // app.chalo.features.foreground.ApplicationForegroundManager
    public final void b(ForegroundListener listener) {
        Intrinsics.i(listener, "listener");
        synchronized (this.b) {
            this.c.remove(listener);
        }
    }

    @Override // app.chalo.features.foreground.ApplicationForegroundManager
    /* JADX INFO: renamed from: isInForeground, reason: from getter */
    public final boolean getF2712a() {
        return this.f2712a;
    }
}
