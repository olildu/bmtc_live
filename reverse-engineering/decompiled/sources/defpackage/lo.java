package defpackage;

import com.arkivanov.essenty.statekeeper.SerializableContainer;
import com.arkivanov.essenty.statekeeper.SerializableContainerKt;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class lo implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18331a;
    public final /* synthetic */ KSerializer b;

    public /* synthetic */ lo(KSerializer kSerializer, int i) {
        this.f18331a = i;
        this.b = kSerializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18331a) {
            case 0:
                KSerializer kSerializer = this.b;
                if (kSerializer != null) {
                    return SerializableContainerKt.a(kSerializer, obj);
                }
                return null;
            case 1:
                SerializableContainer container = (SerializableContainer) obj;
                Intrinsics.i(container, "container");
                KSerializer kSerializer2 = this.b;
                if (kSerializer2 != null) {
                    return container.a(kSerializer2);
                }
                return null;
            case 2:
                List stack = (List) obj;
                Intrinsics.i(stack, "stack");
                KSerializer kSerializer3 = this.b;
                if (kSerializer3 != null) {
                    return SerializableContainerKt.a(BuiltinSerializersKt.b(kSerializer3), stack);
                }
                return null;
            default:
                SerializableContainer container2 = (SerializableContainer) obj;
                Intrinsics.i(container2, "container");
                KSerializer kSerializer4 = this.b;
                if (kSerializer4 == null) {
                    return null;
                }
                Object objA = container2.a(BuiltinSerializersKt.b(kSerializer4));
                if (objA != null) {
                    return (List) objA;
                }
                throw new IllegalStateException("Required value was null.");
        }
    }
}
