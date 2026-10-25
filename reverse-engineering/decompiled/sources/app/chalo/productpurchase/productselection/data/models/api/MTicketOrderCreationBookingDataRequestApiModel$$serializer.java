package app.chalo.productpurchase.productselection.data.models.api;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productpurchase/productselection/data/models/api/MTicketOrderCreationBookingDataRequestApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/MTicketOrderCreationBookingDataRequestApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class MTicketOrderCreationBookingDataRequestApiModel$$serializer implements GeneratedSerializer<MTicketOrderCreationBookingDataRequestApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MTicketOrderCreationBookingDataRequestApiModel$$serializer f8576a;
    private static final SerialDescriptor descriptor;

    static {
        MTicketOrderCreationBookingDataRequestApiModel$$serializer mTicketOrderCreationBookingDataRequestApiModel$$serializer = new MTicketOrderCreationBookingDataRequestApiModel$$serializer();
        f8576a = mTicketOrderCreationBookingDataRequestApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productpurchase.productselection.data.models.api.MTicketOrderCreationBookingDataRequestApiModel", mTicketOrderCreationBookingDataRequestApiModel$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("routeId", false);
        pluginGeneratedSerialDescriptor.j("routeName", false);
        pluginGeneratedSerialDescriptor.j("startStopId", false);
        pluginGeneratedSerialDescriptor.j("startStopName", false);
        pluginGeneratedSerialDescriptor.j("endStopId", false);
        pluginGeneratedSerialDescriptor.j("endStopName", false);
        pluginGeneratedSerialDescriptor.j("specialFeatures", false);
        pluginGeneratedSerialDescriptor.j("validDuration", false);
        pluginGeneratedSerialDescriptor.j("routeDetails", false);
        pluginGeneratedSerialDescriptor.j("passengerDetails", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = MTicketOrderCreationBookingDataRequestApiModel.k;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, lazyArr[6].getValue(), LongSerializer.f18151a, BuiltinSerializersKt.c(MTicketOrderCreationRouteDetailsRequestApiModel$$serializer.f8580a), BuiltinSerializersKt.c(JsonObjectSerializer.f18200a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        JsonObject jsonObject;
        MTicketOrderCreationRouteDetailsRequestApiModel mTicketOrderCreationRouteDetailsRequestApiModel;
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        long j;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MTicketOrderCreationBookingDataRequestApiModel.k;
        int i2 = 9;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
            MTicketOrderCreationRouteDetailsRequestApiModel mTicketOrderCreationRouteDetailsRequestApiModel2 = (MTicketOrderCreationRouteDetailsRequestApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, MTicketOrderCreationRouteDetailsRequestApiModel$$serializer.f8580a, null);
            list = list2;
            str = strDecodeStringElement2;
            jsonObject = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, JsonObjectSerializer.f18200a, null);
            mTicketOrderCreationRouteDetailsRequestApiModel = mTicketOrderCreationRouteDetailsRequestApiModel2;
            str6 = strDecodeStringElement7;
            str4 = strDecodeStringElement5;
            i = 1023;
            str5 = strDecodeStringElement6;
            str3 = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            j = jDecodeLongElement;
        } else {
            boolean z = true;
            int i3 = 0;
            JsonObject jsonObject2 = null;
            MTicketOrderCreationRouteDetailsRequestApiModel mTicketOrderCreationRouteDetailsRequestApiModel3 = null;
            List list3 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 9;
                        break;
                    case 0:
                        i3 |= 1;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 = 9;
                        break;
                    case 1:
                        i3 |= 2;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 = 9;
                        break;
                    case 2:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        i2 = 9;
                        break;
                    case 3:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                        break;
                    case 6:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), list3);
                        i3 |= 64;
                        break;
                    case 7:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
                        i3 |= 128;
                        break;
                    case 8:
                        mTicketOrderCreationRouteDetailsRequestApiModel3 = (MTicketOrderCreationRouteDetailsRequestApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, MTicketOrderCreationRouteDetailsRequestApiModel$$serializer.f8580a, mTicketOrderCreationRouteDetailsRequestApiModel3);
                        i3 |= 256;
                        break;
                    case 9:
                        jsonObject2 = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, JsonObjectSerializer.f18200a, jsonObject2);
                        i3 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            jsonObject = jsonObject2;
            mTicketOrderCreationRouteDetailsRequestApiModel = mTicketOrderCreationRouteDetailsRequestApiModel3;
            list = list3;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement11;
            str3 = strDecodeStringElement12;
            str4 = strDecodeStringElement8;
            str5 = strDecodeStringElement9;
            str6 = strDecodeStringElement10;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MTicketOrderCreationBookingDataRequestApiModel(i, str, str2, str3, str4, str5, str6, list, j, mTicketOrderCreationRouteDetailsRequestApiModel, jsonObject);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        MTicketOrderCreationBookingDataRequestApiModel value = (MTicketOrderCreationBookingDataRequestApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MTicketOrderCreationBookingDataRequestApiModel.k;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f8575a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), value.g);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, MTicketOrderCreationRouteDetailsRequestApiModel$$serializer.f8580a, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, JsonObjectSerializer.f18200a, value.j);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
