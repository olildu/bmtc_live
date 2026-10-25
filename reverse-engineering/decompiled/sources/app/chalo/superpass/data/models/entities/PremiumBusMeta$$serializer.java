package app.chalo.superpass.data.models.entities;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/superpass/data/models/entities/PremiumBusMeta.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/superpass/data/models/entities/PremiumBusMeta;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PremiumBusMeta$$serializer implements GeneratedSerializer<PremiumBusMeta> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PremiumBusMeta$$serializer f9550a;
    private static final SerialDescriptor descriptor;

    static {
        PremiumBusMeta$$serializer premiumBusMeta$$serializer = new PremiumBusMeta$$serializer();
        f9550a = premiumBusMeta$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.superpass.data.models.entities.PremiumBusMeta", premiumBusMeta$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("startDateChangeAllowed", true);
        pluginGeneratedSerialDescriptor.j("dateChangeEnableStartTime", true);
        pluginGeneratedSerialDescriptor.j("dateChangeEnableEndTime", true);
        pluginGeneratedSerialDescriptor.j("rideRollOverMeta", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{BooleanSerializer.f18123a, BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(RideRollOverMeta$$serializer.f9559a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        Long l;
        Long l2;
        RideRollOverMeta rideRollOverMeta;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, longSerializer, null);
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, longSerializer, null);
            rideRollOverMeta = (RideRollOverMeta) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, RideRollOverMeta$$serializer.f9559a, null);
            l2 = l4;
            l = l3;
            i = 15;
        } else {
            boolean z = true;
            zDecodeBooleanElement = false;
            Long l5 = null;
            Long l6 = null;
            RideRollOverMeta rideRollOverMeta2 = null;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, l5);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.f18151a, l6);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    rideRollOverMeta2 = (RideRollOverMeta) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, RideRollOverMeta$$serializer.f9559a, rideRollOverMeta2);
                    i2 |= 8;
                }
            }
            i = i2;
            l = l5;
            l2 = l6;
            rideRollOverMeta = rideRollOverMeta2;
        }
        boolean z2 = zDecodeBooleanElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PremiumBusMeta(i, z2, l, l2, rideRollOverMeta);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PremiumBusMeta value = (PremiumBusMeta) obj;
        Intrinsics.i(value, "value");
        RideRollOverMeta rideRollOverMeta = value.d;
        Long l = value.c;
        Long l2 = value.b;
        boolean z = value.f9549a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || l2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.f18151a, l2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || l != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.f18151a, l);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || rideRollOverMeta != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, RideRollOverMeta$$serializer.f9559a, rideRollOverMeta);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
