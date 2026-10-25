package app.chalo.multimodalticket.data.model.api;

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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/multimodalticket/data/model/api/GroupTicketMetroTripDetailsApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketMetroTripDetailsApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class GroupTicketMetroTripDetailsApiModel$$serializer implements GeneratedSerializer<GroupTicketMetroTripDetailsApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GroupTicketMetroTripDetailsApiModel$$serializer f5831a;
    private static final SerialDescriptor descriptor;

    static {
        GroupTicketMetroTripDetailsApiModel$$serializer groupTicketMetroTripDetailsApiModel$$serializer = new GroupTicketMetroTripDetailsApiModel$$serializer();
        f5831a = groupTicketMetroTripDetailsApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.multimodalticket.data.model.api.GroupTicketMetroTripDetailsApiModel", groupTicketMetroTripDetailsApiModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("startStop", false);
        pluginGeneratedSerialDescriptor.j("endStop", false);
        pluginGeneratedSerialDescriptor.j("journeyOverview", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = GroupTicketMetroTripDetailsApiModel.d;
        GroupTicketStopDetailsApiModel$$serializer groupTicketStopDetailsApiModel$$serializer = GroupTicketStopDetailsApiModel$$serializer.f5833a;
        return new KSerializer[]{groupTicketStopDetailsApiModel$$serializer, groupTicketStopDetailsApiModel$$serializer, lazyArr[2].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        GroupTicketStopDetailsApiModel groupTicketStopDetailsApiModel;
        GroupTicketStopDetailsApiModel groupTicketStopDetailsApiModel2;
        List list;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = GroupTicketMetroTripDetailsApiModel.d;
        GroupTicketStopDetailsApiModel groupTicketStopDetailsApiModel3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            GroupTicketStopDetailsApiModel$$serializer groupTicketStopDetailsApiModel$$serializer = GroupTicketStopDetailsApiModel$$serializer.f5833a;
            groupTicketStopDetailsApiModel = (GroupTicketStopDetailsApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, groupTicketStopDetailsApiModel$$serializer, null);
            groupTicketStopDetailsApiModel2 = (GroupTicketStopDetailsApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, groupTicketStopDetailsApiModel$$serializer, null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            GroupTicketStopDetailsApiModel groupTicketStopDetailsApiModel4 = null;
            List list2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    groupTicketStopDetailsApiModel3 = (GroupTicketStopDetailsApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, GroupTicketStopDetailsApiModel$$serializer.f5833a, groupTicketStopDetailsApiModel3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    groupTicketStopDetailsApiModel4 = (GroupTicketStopDetailsApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, GroupTicketStopDetailsApiModel$$serializer.f5833a, groupTicketStopDetailsApiModel4);
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
            groupTicketStopDetailsApiModel = groupTicketStopDetailsApiModel3;
            groupTicketStopDetailsApiModel2 = groupTicketStopDetailsApiModel4;
            list = list2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GroupTicketMetroTripDetailsApiModel(i, groupTicketStopDetailsApiModel, groupTicketStopDetailsApiModel2, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        GroupTicketMetroTripDetailsApiModel value = (GroupTicketMetroTripDetailsApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = GroupTicketMetroTripDetailsApiModel.d;
        GroupTicketStopDetailsApiModel$$serializer groupTicketStopDetailsApiModel$$serializer = GroupTicketStopDetailsApiModel$$serializer.f5833a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, groupTicketStopDetailsApiModel$$serializer, value.f5830a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, groupTicketStopDetailsApiModel$$serializer, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), value.c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
