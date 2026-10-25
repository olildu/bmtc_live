package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class hh0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15826a;
    public final /* synthetic */ KSerializer b;
    public final /* synthetic */ KSerializer c;

    public /* synthetic */ hh0(KSerializer kSerializer, KSerializer kSerializer2, int i) {
        this.f15826a = i;
        this.b = kSerializer;
        this.c = kSerializer2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClassSerialDescriptorBuilder buildSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
        switch (this.f15826a) {
            case 0:
                Intrinsics.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
                ClassSerialDescriptorBuilder.b(buildSerialDescriptor, "key", this.b.getDescriptor());
                ClassSerialDescriptorBuilder.b(buildSerialDescriptor, "value", this.c.getDescriptor());
                break;
            default:
                Intrinsics.i(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                ClassSerialDescriptorBuilder.b(buildSerialDescriptor, "first", this.b.getDescriptor());
                ClassSerialDescriptorBuilder.b(buildSerialDescriptor, "second", this.c.getDescriptor());
                break;
        }
        return Unit.f17538a;
    }
}
