package defpackage;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class lq implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18337a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lq(Object obj, int i) {
        this.f18337a = i;
        this.b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f18337a) {
            case 0:
                return Component.lambda$of$2(this.b, componentContainer);
            case 1:
                return Component.lambda$intoSet$4(this.b, componentContainer);
            case 2:
                return Component.lambda$intoSet$3(this.b, componentContainer);
            case 3:
                return Component.lambda$of$0(this.b, componentContainer);
            default:
                return Component.lambda$of$1(this.b, componentContainer);
        }
    }
}
