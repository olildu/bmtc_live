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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/multimodalticket/data/model/api/GroupTicketSummaryTripDetailApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketSummaryTripDetailApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class GroupTicketSummaryTripDetailApiModel$$serializer implements GeneratedSerializer<GroupTicketSummaryTripDetailApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GroupTicketSummaryTripDetailApiModel$$serializer f5847a;
    private static final SerialDescriptor descriptor;

    static {
        GroupTicketSummaryTripDetailApiModel$$serializer groupTicketSummaryTripDetailApiModel$$serializer = new GroupTicketSummaryTripDetailApiModel$$serializer();
        f5847a = groupTicketSummaryTripDetailApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.multimodalticket.data.model.api.GroupTicketSummaryTripDetailApiModel", groupTicketSummaryTripDetailApiModel$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("routeId", true);
        pluginGeneratedSerialDescriptor.j("startStop", false);
        pluginGeneratedSerialDescriptor.j("endStop", false);
        pluginGeneratedSerialDescriptor.j("journeyOverview", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = GroupTicketSummaryTripDetailApiModel.e;
        KSerializer kSerializerC = BuiltinSerializersKt.c(StringSerializer.f18170a);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c((KSerializer) lazyArr[3].getValue());
        GroupTicketSummaryStopApiModel$$serializer groupTicketSummaryStopApiModel$$serializer = GroupTicketSummaryStopApiModel$$serializer.f5845a;
        return new KSerializer[]{kSerializerC, groupTicketSummaryStopApiModel$$serializer, groupTicketSummaryStopApiModel$$serializer, kSerializerC2};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        GroupTicketSummaryStopApiModel groupTicketSummaryStopApiModel;
        GroupTicketSummaryStopApiModel groupTicketSummaryStopApiModel2;
        List list;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = GroupTicketSummaryTripDetailApiModel.e;
        String str2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, null);
            GroupTicketSummaryStopApiModel$$serializer groupTicketSummaryStopApiModel$$serializer = GroupTicketSummaryStopApiModel$$serializer.f5845a;
            GroupTicketSummaryStopApiModel groupTicketSummaryStopApiModel3 = (GroupTicketSummaryStopApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, groupTicketSummaryStopApiModel$$serializer, null);
            GroupTicketSummaryStopApiModel groupTicketSummaryStopApiModel4 = (GroupTicketSummaryStopApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, groupTicketSummaryStopApiModel$$serializer, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            str = str3;
            groupTicketSummaryStopApiModel2 = groupTicketSummaryStopApiModel4;
            i = 15;
            groupTicketSummaryStopApiModel = groupTicketSummaryStopApiModel3;
        } else {
            boolean z = true;
            int i2 = 0;
            GroupTicketSummaryStopApiModel groupTicketSummaryStopApiModel5 = null;
            GroupTicketSummaryStopApiModel groupTicketSummaryStopApiModel6 = null;
            List list2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    groupTicketSummaryStopApiModel5 = (GroupTicketSummaryStopApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, GroupTicketSummaryStopApiModel$$serializer.f5845a, groupTicketSummaryStopApiModel5);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    groupTicketSummaryStopApiModel6 = (GroupTicketSummaryStopApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, GroupTicketSummaryStopApiModel$$serializer.f5845a, groupTicketSummaryStopApiModel6);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), list2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str2;
            groupTicketSummaryStopApiModel = groupTicketSummaryStopApiModel5;
            groupTicketSummaryStopApiModel2 = groupTicketSummaryStopApiModel6;
            list = list2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GroupTicketSummaryTripDetailApiModel(i, str, groupTicketSummaryStopApiModel, groupTicketSummaryStopApiModel2, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        GroupTicketSummaryTripDetailApiModel value = (GroupTicketSummaryTripDetailApiModel) obj;
        Intrinsics.i(value, "value");
        String str = value.f5846a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = GroupTicketSummaryTripDetailApiModel.e;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str);
        }
        GroupTicketSummaryStopApiModel$$serializer groupTicketSummaryStopApiModel$$serializer = GroupTicketSummaryStopApiModel$$serializer.f5845a;
        GroupTicketSummaryStopApiModel groupTicketSummaryStopApiModel = value.b;
        List list = value.d;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, groupTicketSummaryStopApiModel$$serializer, groupTicketSummaryStopApiModel);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, groupTicketSummaryStopApiModel$$serializer, value.c);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
