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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/multimodalticket/data/model/api/GroupTicketSummaryLegApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketSummaryLegApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class GroupTicketSummaryLegApiModel$$serializer implements GeneratedSerializer<GroupTicketSummaryLegApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GroupTicketSummaryLegApiModel$$serializer f5835a;
    private static final SerialDescriptor descriptor;

    static {
        GroupTicketSummaryLegApiModel$$serializer groupTicketSummaryLegApiModel$$serializer = new GroupTicketSummaryLegApiModel$$serializer();
        f5835a = groupTicketSummaryLegApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.multimodalticket.data.model.api.GroupTicketSummaryLegApiModel", groupTicketSummaryLegApiModel$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("sequence", false);
        pluginGeneratedSerialDescriptor.j("transportMode", false);
        pluginGeneratedSerialDescriptor.j("configurationId", false);
        pluginGeneratedSerialDescriptor.j("tripDetail", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{IntSerializer.f18146a, stringSerializer, stringSerializer, GroupTicketSummaryTripDetailApiModel$$serializer.f5847a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeIntElement;
        int i;
        String str;
        String str2;
        GroupTicketSummaryTripDetailApiModel groupTicketSummaryTripDetailApiModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            groupTicketSummaryTripDetailApiModel = (GroupTicketSummaryTripDetailApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, GroupTicketSummaryTripDetailApiModel$$serializer.f5847a, null);
            str2 = strDecodeStringElement2;
            str = strDecodeStringElement;
            i = 15;
        } else {
            boolean z = true;
            iDecodeIntElement = 0;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            GroupTicketSummaryTripDetailApiModel groupTicketSummaryTripDetailApiModel2 = null;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    groupTicketSummaryTripDetailApiModel2 = (GroupTicketSummaryTripDetailApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, GroupTicketSummaryTripDetailApiModel$$serializer.f5847a, groupTicketSummaryTripDetailApiModel2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            groupTicketSummaryTripDetailApiModel = groupTicketSummaryTripDetailApiModel2;
        }
        int i3 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GroupTicketSummaryLegApiModel(i, i3, str, str2, groupTicketSummaryTripDetailApiModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        GroupTicketSummaryLegApiModel value = (GroupTicketSummaryLegApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, value.f5834a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, GroupTicketSummaryTripDetailApiModel$$serializer.f5847a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
