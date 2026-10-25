package app.chalo.livetracking.frameworklivetracking.data.model.api.response;

import app.chalo.livetracking.frameworklivetracking.data.model.app.SubscriptionRetryPolicy;
import app.chalo.livetracking.frameworklivetracking.data.model.app.SubscriptionRetryPolicy$$serializer;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/frameworklivetracking/data/model/api/response/ChaloRtsServiceConfigApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/ChaloRtsServiceConfigApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ChaloRtsServiceConfigApiModel$$serializer implements GeneratedSerializer<ChaloRtsServiceConfigApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ChaloRtsServiceConfigApiModel$$serializer f4275a;
    private static final SerialDescriptor descriptor;

    static {
        ChaloRtsServiceConfigApiModel$$serializer chaloRtsServiceConfigApiModel$$serializer = new ChaloRtsServiceConfigApiModel$$serializer();
        f4275a = chaloRtsServiceConfigApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.frameworklivetracking.data.model.api.response.ChaloRtsServiceConfigApiModel", chaloRtsServiceConfigApiModel$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("isPolling", false);
        pluginGeneratedSerialDescriptor.j("randomizationFactor", true);
        pluginGeneratedSerialDescriptor.j("resyncFrequency", true);
        pluginGeneratedSerialDescriptor.j("pollingFrequency", true);
        pluginGeneratedSerialDescriptor.j("retryPolicy", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{BooleanSerializer.f18123a, DoubleSerializer.f18137a, BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(SubscriptionRetryPolicy$$serializer.f4317a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        double d;
        Long l;
        Long l2;
        SubscriptionRetryPolicy subscriptionRetryPolicy;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 1);
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, longSerializer, null);
            i = 31;
            l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            subscriptionRetryPolicy = (SubscriptionRetryPolicy) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, SubscriptionRetryPolicy$$serializer.f4317a, null);
            l = l3;
            d = dDecodeDoubleElement;
        } else {
            double dDecodeDoubleElement2 = 0.0d;
            boolean z = true;
            zDecodeBooleanElement = false;
            Long l4 = null;
            Long l5 = null;
            SubscriptionRetryPolicy subscriptionRetryPolicy2 = null;
            i = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iDecodeElementIndex == 1) {
                    dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 1);
                    i |= 2;
                } else if (iDecodeElementIndex == 2) {
                    l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.f18151a, l4);
                    i |= 4;
                } else if (iDecodeElementIndex == 3) {
                    l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, l5);
                    i |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    subscriptionRetryPolicy2 = (SubscriptionRetryPolicy) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, SubscriptionRetryPolicy$$serializer.f4317a, subscriptionRetryPolicy2);
                    i |= 16;
                }
            }
            d = dDecodeDoubleElement2;
            l = l4;
            l2 = l5;
            subscriptionRetryPolicy = subscriptionRetryPolicy2;
        }
        boolean z2 = zDecodeBooleanElement;
        int i2 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ChaloRtsServiceConfigApiModel(i2, z2, d, l, l2, subscriptionRetryPolicy);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ChaloRtsServiceConfigApiModel value = (ChaloRtsServiceConfigApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        boolean z = value.f4274a;
        SubscriptionRetryPolicy subscriptionRetryPolicy = value.e;
        Long l = value.d;
        Long l2 = value.c;
        double d = value.b;
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, z);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || Double.compare(d, 0.0d) != 0) {
            compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 1, d);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || l2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.f18151a, l2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || l != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, l);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || subscriptionRetryPolicy != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, SubscriptionRetryPolicy$$serializer.f4317a, subscriptionRetryPolicy);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
