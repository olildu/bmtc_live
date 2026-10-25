package app.chalo.livetracking.frameworklivetracking.data.model.api.response;

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
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/frameworklivetracking/data/model/api/response/ChaloSocketConfigResponseApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/ChaloSocketConfigResponseApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ChaloSocketConfigResponseApiModel$$serializer implements GeneratedSerializer<ChaloSocketConfigResponseApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ChaloSocketConfigResponseApiModel$$serializer f4277a;
    private static final SerialDescriptor descriptor;

    static {
        ChaloSocketConfigResponseApiModel$$serializer chaloSocketConfigResponseApiModel$$serializer = new ChaloSocketConfigResponseApiModel$$serializer();
        f4277a = chaloSocketConfigResponseApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.frameworklivetracking.data.model.api.response.ChaloSocketConfigResponseApiModel", chaloSocketConfigResponseApiModel$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("connection", false);
        pluginGeneratedSerialDescriptor.j("subscriptions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.c(ConnectionDataApiModel$$serializer.f4279a), BuiltinSerializersKt.c(JsonObjectSerializer.f18200a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        ConnectionDataApiModel connectionDataApiModel;
        JsonObject jsonObject;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        ConnectionDataApiModel connectionDataApiModel2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            connectionDataApiModel = (ConnectionDataApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ConnectionDataApiModel$$serializer.f4279a, null);
            jsonObject = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, JsonObjectSerializer.f18200a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            JsonObject jsonObject2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    connectionDataApiModel2 = (ConnectionDataApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ConnectionDataApiModel$$serializer.f4279a, connectionDataApiModel2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jsonObject2 = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, JsonObjectSerializer.f18200a, jsonObject2);
                    i2 |= 2;
                }
            }
            i = i2;
            connectionDataApiModel = connectionDataApiModel2;
            jsonObject = jsonObject2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ChaloSocketConfigResponseApiModel(i, connectionDataApiModel, jsonObject);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ChaloSocketConfigResponseApiModel value = (ChaloSocketConfigResponseApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ConnectionDataApiModel$$serializer connectionDataApiModel$$serializer = ConnectionDataApiModel$$serializer.f4279a;
        ConnectionDataApiModel connectionDataApiModel = value.f4276a;
        JsonObject jsonObject = value.b;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, connectionDataApiModel$$serializer, connectionDataApiModel);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || jsonObject != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, JsonObjectSerializer.f18200a, jsonObject);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
