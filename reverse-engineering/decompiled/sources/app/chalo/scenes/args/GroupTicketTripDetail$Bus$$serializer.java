package app.chalo.scenes.args;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/scenes/args/GroupTicketTripDetail.Bus.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/scenes/args/GroupTicketTripDetail$Bus;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class GroupTicketTripDetail$Bus$$serializer implements GeneratedSerializer<GroupTicketTripDetail.Bus> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GroupTicketTripDetail$Bus$$serializer f9263a;
    private static final SerialDescriptor descriptor;

    static {
        GroupTicketTripDetail$Bus$$serializer groupTicketTripDetail$Bus$$serializer = new GroupTicketTripDetail$Bus$$serializer();
        f9263a = groupTicketTripDetail$Bus$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.scenes.args.GroupTicketTripDetail.Bus", groupTicketTripDetail$Bus$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("routeId", false);
        pluginGeneratedSerialDescriptor.j("routeName", true);
        pluginGeneratedSerialDescriptor.j("startStop", false);
        pluginGeneratedSerialDescriptor.j("endStop", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        GroupTicketStop$$serializer groupTicketStop$$serializer = GroupTicketStop$$serializer.f9261a;
        return new KSerializer[]{stringSerializer, kSerializerC, groupTicketStop$$serializer, groupTicketStop$$serializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        GroupTicketStop groupTicketStop;
        GroupTicketStop groupTicketStop2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, null);
            GroupTicketStop$$serializer groupTicketStop$$serializer = GroupTicketStop$$serializer.f9261a;
            GroupTicketStop groupTicketStop3 = (GroupTicketStop) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, groupTicketStop$$serializer, null);
            str = strDecodeStringElement2;
            groupTicketStop2 = (GroupTicketStop) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, groupTicketStop$$serializer, null);
            groupTicketStop = groupTicketStop3;
            str2 = str3;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            GroupTicketStop groupTicketStop4 = null;
            GroupTicketStop groupTicketStop5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str4);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    groupTicketStop4 = (GroupTicketStop) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, GroupTicketStop$$serializer.f9261a, groupTicketStop4);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    groupTicketStop5 = (GroupTicketStop) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, GroupTicketStop$$serializer.f9261a, groupTicketStop5);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            str2 = str4;
            groupTicketStop = groupTicketStop4;
            groupTicketStop2 = groupTicketStop5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GroupTicketTripDetail.Bus(i, str, str2, groupTicketStop, groupTicketStop2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        GroupTicketTripDetail.Bus value = (GroupTicketTripDetail.Bus) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.b;
        String str2 = value.c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str2);
        }
        GroupTicketStop$$serializer groupTicketStop$$serializer = GroupTicketStop$$serializer.f9261a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, groupTicketStop$$serializer, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, groupTicketStop$$serializer, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
