package app.chalo.superpass.data.models;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/superpass/data/models/SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/superpass/data/models/SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel$$serializer implements GeneratedSerializer<SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel$$serializer f9536a;
    private static final SerialDescriptor descriptor;

    static {
        SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel$$serializer syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel$$serializer = new SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel$$serializer();
        f9536a = syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.superpass.data.models.SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel", syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("passSyncStatus", false);
        pluginGeneratedSerialDescriptor.j("ticketSyncStatus", false);
        pluginGeneratedSerialDescriptor.j("passTripHistory", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(PassTripHistoryApiResponseModel$$serializer.f9532a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Boolean bool;
        Boolean bool2;
        PassTripHistoryApiResponseModel passTripHistoryApiResponseModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Boolean bool3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, booleanSerializer, null);
            bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, booleanSerializer, null);
            passTripHistoryApiResponseModel = (PassTripHistoryApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, PassTripHistoryApiResponseModel$$serializer.f9532a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            Boolean bool4 = null;
            PassTripHistoryApiResponseModel passTripHistoryApiResponseModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.f18123a, bool3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.f18123a, bool4);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    passTripHistoryApiResponseModel2 = (PassTripHistoryApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, PassTripHistoryApiResponseModel$$serializer.f9532a, passTripHistoryApiResponseModel2);
                    i2 |= 4;
                }
            }
            i = i2;
            bool = bool3;
            bool2 = bool4;
            passTripHistoryApiResponseModel = passTripHistoryApiResponseModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel(i, bool, bool2, passTripHistoryApiResponseModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel value = (SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, booleanSerializer, value.f9535a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, booleanSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, PassTripHistoryApiResponseModel$$serializer.f9532a, value.c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
