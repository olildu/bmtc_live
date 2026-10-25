package app.chalo.features.productsync.model.api;

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
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/features/productsync/model/api/BookingHistoryDataApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/features/productsync/model/api/BookingHistoryDataApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class BookingHistoryDataApiModel$$serializer implements GeneratedSerializer<BookingHistoryDataApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BookingHistoryDataApiModel$$serializer f2746a;
    private static final SerialDescriptor descriptor;

    static {
        BookingHistoryDataApiModel$$serializer bookingHistoryDataApiModel$$serializer = new BookingHistoryDataApiModel$$serializer();
        f2746a = bookingHistoryDataApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.features.productsync.model.api.BookingHistoryDataApiModel", bookingHistoryDataApiModel$$serializer, 5);
        pluginGeneratedSerialDescriptor.j(CLConstants.INPUT_CONFIGURATION, true);
        pluginGeneratedSerialDescriptor.j("passes", true);
        pluginGeneratedSerialDescriptor.j("recentTransactions", true);
        pluginGeneratedSerialDescriptor.j("rides", true);
        pluginGeneratedSerialDescriptor.j("ticket", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = BuiltinSerializersKt.c(JsonObjectSerializer.f18200a);
        JsonArraySerializer jsonArraySerializer = JsonArraySerializer.f18187a;
        return new KSerializer[]{kSerializerC, BuiltinSerializersKt.c(jsonArraySerializer), BuiltinSerializersKt.c(jsonArraySerializer), BuiltinSerializersKt.c(jsonArraySerializer), BuiltinSerializersKt.c(jsonArraySerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        JsonObject jsonObject;
        JsonArray jsonArray;
        JsonArray jsonArray2;
        JsonArray jsonArray3;
        JsonArray jsonArray4;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        JsonObject jsonObject2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            JsonObject jsonObject3 = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, JsonObjectSerializer.f18200a, null);
            JsonArraySerializer jsonArraySerializer = JsonArraySerializer.f18187a;
            JsonArray jsonArray5 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, jsonArraySerializer, null);
            JsonArray jsonArray6 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, jsonArraySerializer, null);
            jsonObject = jsonObject3;
            jsonArray3 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, jsonArraySerializer, null);
            jsonArray4 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, jsonArraySerializer, null);
            jsonArray2 = jsonArray6;
            jsonArray = jsonArray5;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            JsonArray jsonArray7 = null;
            JsonArray jsonArray8 = null;
            JsonArray jsonArray9 = null;
            JsonArray jsonArray10 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    jsonObject2 = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, JsonObjectSerializer.f18200a, jsonObject2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jsonArray7 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, JsonArraySerializer.f18187a, jsonArray7);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    jsonArray8 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, JsonArraySerializer.f18187a, jsonArray8);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    jsonArray9 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, JsonArraySerializer.f18187a, jsonArray9);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jsonArray10 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, JsonArraySerializer.f18187a, jsonArray10);
                    i2 |= 16;
                }
            }
            i = i2;
            jsonObject = jsonObject2;
            jsonArray = jsonArray7;
            jsonArray2 = jsonArray8;
            jsonArray3 = jsonArray9;
            jsonArray4 = jsonArray10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BookingHistoryDataApiModel(i, jsonObject, jsonArray, jsonArray2, jsonArray3, jsonArray4);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        BookingHistoryDataApiModel value = (BookingHistoryDataApiModel) obj;
        Intrinsics.i(value, "value");
        JsonArray jsonArray = value.e;
        JsonArray jsonArray2 = value.d;
        JsonArray jsonArray3 = value.c;
        JsonArray jsonArray4 = value.b;
        JsonObject jsonObject = value.f2745a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || jsonObject != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, JsonObjectSerializer.f18200a, jsonObject);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || jsonArray4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, JsonArraySerializer.f18187a, jsonArray4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || jsonArray3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, JsonArraySerializer.f18187a, jsonArray3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || jsonArray2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, JsonArraySerializer.f18187a, jsonArray2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || jsonArray != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, JsonArraySerializer.f18187a, jsonArray);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
