package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q51 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19092a;
    public final /* synthetic */ SealedClassSerializer b;

    public /* synthetic */ q51(SealedClassSerializer sealedClassSerializer, int i) {
        this.f19092a = i;
        this.b = sealedClassSerializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClassSerialDescriptorBuilder buildSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
        switch (this.f19092a) {
            case 0:
                Intrinsics.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
                ClassSerialDescriptorBuilder.b(buildSerialDescriptor, "type", StringSerializer.b);
                StringBuilder sb = new StringBuilder("kotlinx.serialization.Sealed<");
                SealedClassSerializer sealedClassSerializer = this.b;
                sb.append(sealedClassSerializer.f18093a.f());
                sb.append('>');
                q51 q51Var = new q51(sealedClassSerializer, 1);
                ClassSerialDescriptorBuilder.b(buildSerialDescriptor, "value", SerialDescriptorsKt.e(sb.toString(), SerialKind.CONTEXTUAL.f18115a, new SerialDescriptor[0], q51Var));
                List list = sealedClassSerializer.b;
                Intrinsics.i(list, "<set-?>");
                buildSerialDescriptor.b = list;
                break;
            default:
                Intrinsics.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
                for (Map.Entry entry : this.b.e.entrySet()) {
                    ClassSerialDescriptorBuilder.b(buildSerialDescriptor, (String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor());
                }
                break;
        }
        return Unit.f17538a;
    }
}
