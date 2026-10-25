package app.chalo.scenes.args;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/scenes/args/GroupTicketTripDetail.Metro.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/scenes/args/GroupTicketTripDetail$Metro;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class GroupTicketTripDetail$Metro$$serializer implements GeneratedSerializer<GroupTicketTripDetail.Metro> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GroupTicketTripDetail$Metro$$serializer f9264a;
    private static final SerialDescriptor descriptor;

    static {
        GroupTicketTripDetail$Metro$$serializer groupTicketTripDetail$Metro$$serializer = new GroupTicketTripDetail$Metro$$serializer();
        f9264a = groupTicketTripDetail$Metro$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.scenes.args.GroupTicketTripDetail.Metro", groupTicketTripDetail$Metro$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("startStop", false);
        pluginGeneratedSerialDescriptor.j("endStop", false);
        pluginGeneratedSerialDescriptor.j("journeyOverview", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = GroupTicketTripDetail.Metro.e;
        GroupTicketStop$$serializer groupTicketStop$$serializer = GroupTicketStop$$serializer.f9261a;
        return new KSerializer[]{groupTicketStop$$serializer, groupTicketStop$$serializer, lazyArr[2].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        GroupTicketStop groupTicketStop;
        GroupTicketStop groupTicketStop2;
        List list;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = GroupTicketTripDetail.Metro.e;
        GroupTicketStop groupTicketStop3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            GroupTicketStop$$serializer groupTicketStop$$serializer = GroupTicketStop$$serializer.f9261a;
            groupTicketStop = (GroupTicketStop) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, groupTicketStop$$serializer, null);
            groupTicketStop2 = (GroupTicketStop) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, groupTicketStop$$serializer, null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            GroupTicketStop groupTicketStop4 = null;
            List list2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    groupTicketStop3 = (GroupTicketStop) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, GroupTicketStop$$serializer.f9261a, groupTicketStop3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    groupTicketStop4 = (GroupTicketStop) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, GroupTicketStop$$serializer.f9261a, groupTicketStop4);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), list2);
                    i2 |= 4;
                }
            }
            i = i2;
            groupTicketStop = groupTicketStop3;
            groupTicketStop2 = groupTicketStop4;
            list = list2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GroupTicketTripDetail.Metro(i, groupTicketStop, groupTicketStop2, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        GroupTicketTripDetail.Metro value = (GroupTicketTripDetail.Metro) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = GroupTicketTripDetail.Metro.e;
        GroupTicketStop$$serializer groupTicketStop$$serializer = GroupTicketStop$$serializer.f9261a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, groupTicketStop$$serializer, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, groupTicketStop$$serializer, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
