package app.chalo.multimodalticket.data.model.api;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/multimodalticket/data/model/api/GroupTicketBusTripDetailsApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketBusTripDetailsApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class GroupTicketBusTripDetailsApiModel$$serializer implements GeneratedSerializer<GroupTicketBusTripDetailsApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GroupTicketBusTripDetailsApiModel$$serializer f5805a;
    private static final SerialDescriptor descriptor;

    static {
        GroupTicketBusTripDetailsApiModel$$serializer groupTicketBusTripDetailsApiModel$$serializer = new GroupTicketBusTripDetailsApiModel$$serializer();
        f5805a = groupTicketBusTripDetailsApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.multimodalticket.data.model.api.GroupTicketBusTripDetailsApiModel", groupTicketBusTripDetailsApiModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("routeId", false);
        pluginGeneratedSerialDescriptor.j("startStop", false);
        pluginGeneratedSerialDescriptor.j("endStop", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        GroupTicketStopDetailsApiModel$$serializer groupTicketStopDetailsApiModel$$serializer = GroupTicketStopDetailsApiModel$$serializer.f5833a;
        return new KSerializer[]{StringSerializer.f18170a, groupTicketStopDetailsApiModel$$serializer, groupTicketStopDetailsApiModel$$serializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String strDecodeStringElement;
        GroupTicketStopDetailsApiModel groupTicketStopDetailsApiModel;
        GroupTicketStopDetailsApiModel groupTicketStopDetailsApiModel2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            GroupTicketStopDetailsApiModel$$serializer groupTicketStopDetailsApiModel$$serializer = GroupTicketStopDetailsApiModel$$serializer.f5833a;
            groupTicketStopDetailsApiModel = (GroupTicketStopDetailsApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, groupTicketStopDetailsApiModel$$serializer, null);
            groupTicketStopDetailsApiModel2 = (GroupTicketStopDetailsApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, groupTicketStopDetailsApiModel$$serializer, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            GroupTicketStopDetailsApiModel groupTicketStopDetailsApiModel3 = null;
            GroupTicketStopDetailsApiModel groupTicketStopDetailsApiModel4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    groupTicketStopDetailsApiModel3 = (GroupTicketStopDetailsApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, GroupTicketStopDetailsApiModel$$serializer.f5833a, groupTicketStopDetailsApiModel3);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    groupTicketStopDetailsApiModel4 = (GroupTicketStopDetailsApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, GroupTicketStopDetailsApiModel$$serializer.f5833a, groupTicketStopDetailsApiModel4);
                    i2 |= 4;
                }
            }
            i = i2;
            strDecodeStringElement = strDecodeStringElement2;
            groupTicketStopDetailsApiModel = groupTicketStopDetailsApiModel3;
            groupTicketStopDetailsApiModel2 = groupTicketStopDetailsApiModel4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GroupTicketBusTripDetailsApiModel(i, strDecodeStringElement, groupTicketStopDetailsApiModel, groupTicketStopDetailsApiModel2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        GroupTicketBusTripDetailsApiModel value = (GroupTicketBusTripDetailsApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f5804a);
        GroupTicketStopDetailsApiModel$$serializer groupTicketStopDetailsApiModel$$serializer = GroupTicketStopDetailsApiModel$$serializer.f5833a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, groupTicketStopDetailsApiModel$$serializer, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, groupTicketStopDetailsApiModel$$serializer, value.c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
