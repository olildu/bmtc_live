package app.chalo.productbooking.common.data.models.api.response;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productbooking/common/data/models/api/response/PBBulkBookingAvailableSlotsTripApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/PBBulkBookingAvailableSlotsTripApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PBBulkBookingAvailableSlotsTripApiResponseModel$$serializer implements GeneratedSerializer<PBBulkBookingAvailableSlotsTripApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PBBulkBookingAvailableSlotsTripApiResponseModel$$serializer f8144a;
    private static final SerialDescriptor descriptor;

    static {
        PBBulkBookingAvailableSlotsTripApiResponseModel$$serializer pBBulkBookingAvailableSlotsTripApiResponseModel$$serializer = new PBBulkBookingAvailableSlotsTripApiResponseModel$$serializer();
        f8144a = pBBulkBookingAvailableSlotsTripApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productbooking.common.data.models.api.response.PBBulkBookingAvailableSlotsTripApiResponseModel", pBBulkBookingAvailableSlotsTripApiResponseModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("routeId", false);
        pluginGeneratedSerialDescriptor.j("tripId", false);
        pluginGeneratedSerialDescriptor.j("fromStopTime", false);
        pluginGeneratedSerialDescriptor.j("toStopTime", false);
        pluginGeneratedSerialDescriptor.j("tripStartTime", false);
        pluginGeneratedSerialDescriptor.j("seatAssignmentType", false);
        pluginGeneratedSerialDescriptor.j("specialFeatures", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = PBBulkBookingAvailableSlotsTripApiResponseModel.h;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{kSerializerC, kSerializerC2, BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(IntSerializer.f18146a), BuiltinSerializersKt.c((KSerializer) lazyArr[6].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        List list;
        Integer num;
        String str;
        String str2;
        Long l;
        Long l2;
        Long l3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PBBulkBookingAvailableSlotsTripApiResponseModel.h;
        int i2 = 5;
        String str3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, longSerializer, null);
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, longSerializer, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.f18146a, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            str2 = str5;
            num = num2;
            l2 = l5;
            l3 = l6;
            l = l4;
            i = 127;
            str = str4;
        } else {
            boolean z = true;
            int i3 = 0;
            List list2 = null;
            Integer num3 = null;
            String str6 = null;
            Long l7 = null;
            Long l8 = null;
            Long l9 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                        break;
                    case 0:
                        str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str3);
                        i3 |= 1;
                        i2 = 5;
                        break;
                    case 1:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str6);
                        i3 |= 2;
                        i2 = 5;
                        break;
                    case 2:
                        l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.f18151a, l7);
                        i3 |= 4;
                        i2 = 5;
                        break;
                    case 3:
                        l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, l8);
                        i3 |= 8;
                        break;
                    case 4:
                        l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, l9);
                        i3 |= 16;
                        break;
                    case 5:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, IntSerializer.f18146a, num3);
                        i3 |= 32;
                        break;
                    case 6:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), list2);
                        i3 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            list = list2;
            num = num3;
            str = str3;
            str2 = str6;
            l = l7;
            l2 = l8;
            l3 = l9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PBBulkBookingAvailableSlotsTripApiResponseModel(i, str, str2, l, l2, l3, num, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PBBulkBookingAvailableSlotsTripApiResponseModel value = (PBBulkBookingAvailableSlotsTripApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PBBulkBookingAvailableSlotsTripApiResponseModel.h;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, value.f8143a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        LongSerializer longSerializer = LongSerializer.f18151a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, longSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, longSerializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, longSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.f18146a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), value.g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
