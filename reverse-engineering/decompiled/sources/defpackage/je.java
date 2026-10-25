package defpackage;

import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.inmobi.media.C2541k8;
import com.inmobi.media.C2569m8;
import com.inmobi.media.C2694v8;
import in.juspay.hyperupi.commonLibrary.v18.CL18;
import in.juspay.hyperupi.commonLibraryUtils.CLInterface;
import org.npci.upi.security.services.CLServices;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class je implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17397a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ je(SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsReport.Session.Event event, EventMetadata eventMetadata, boolean z) {
        this.f17397a = 1;
        this.c = sessionReportingCoordinator;
        this.d = event;
        this.e = eventMetadata;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17397a) {
            case 0:
                CL18.AnonymousClass1.serviceConnected$lambda$1((CL18) this.c, this.b, (CLServices) this.d, (CLInterface.CLTask) this.e);
                break;
            case 1:
                ((SessionReportingCoordinator) this.c).lambda$persistEvent$0((CrashlyticsReport.Session.Event) this.d, (EventMetadata) this.e, this.b);
                break;
            default:
                C2541k8.a((C2569m8) this.c, this.b, (C2541k8) this.d, (C2694v8) this.e);
                break;
        }
    }

    public /* synthetic */ je(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.f17397a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }
}
