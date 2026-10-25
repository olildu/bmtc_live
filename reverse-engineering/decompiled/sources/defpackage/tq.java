package defpackage;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.tracing.ComponentMonitor;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tq implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19679a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tq(String str, Object obj, int i) {
        this.f19679a = i;
        this.b = str;
        this.c = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f19679a) {
            case 0:
                return ComponentMonitor.lambda$processRegistrar$0(this.b, (Component) this.c, componentContainer);
            default:
                return LibraryVersionComponent.lambda$fromContext$0(this.b, (LibraryVersionComponent.VersionExtractor) this.c, componentContainer);
        }
    }
}
