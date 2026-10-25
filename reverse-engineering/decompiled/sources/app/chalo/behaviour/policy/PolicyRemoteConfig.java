package app.chalo.behaviour.policy;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u0003*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Lapp/chalo/behaviour/policy/PolicyRemoteConfig;", "T", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PolicyRemoteConfig<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PolicyConfigGroup f1017a;
    public final Map b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J-\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0003\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/behaviour/policy/PolicyRemoteConfig$Companion;", "", "T", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Lapp/chalo/behaviour/policy/PolicyRemoteConfig;", "serializer", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final <T> KSerializer<PolicyRemoteConfig<T>> serializer(final KSerializer<T> typeSerial0) {
            Intrinsics.i(typeSerial0, "typeSerial0");
            return new GeneratedSerializer<PolicyRemoteConfig<T>>() { // from class: app.chalo.behaviour.policy.PolicyRemoteConfig$$serializer
                private final SerialDescriptor descriptor;

                {
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.behaviour.policy.PolicyRemoteConfig", this, 2);
                    pluginGeneratedSerialDescriptor.j("common", true);
                    pluginGeneratedSerialDescriptor.j("brands", true);
                    this.descriptor = pluginGeneratedSerialDescriptor;
                }

                @Override // kotlinx.serialization.internal.GeneratedSerializer
                public final KSerializer[] childSerializers() {
                    PolicyConfigGroup.Companion companion = PolicyConfigGroup.INSTANCE;
                    KSerializer<T> kSerializer = typeSerial0;
                    return new KSerializer[]{BuiltinSerializersKt.c(companion.serializer(kSerializer)), new LinkedHashMapSerializer(StringSerializer.f18170a, companion.serializer(kSerializer))};
                }

                @Override // kotlinx.serialization.DeserializationStrategy
                public final Object deserialize(Decoder decoder) {
                    int i;
                    PolicyConfigGroup policyConfigGroup;
                    Map map;
                    Intrinsics.i(decoder, "decoder");
                    SerialDescriptor serialDescriptor = this.descriptor;
                    CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
                    boolean zDecodeSequentially = compositeDecoderBeginStructure.decodeSequentially();
                    KSerializer<T> kSerializer = typeSerial0;
                    PolicyConfigGroup policyConfigGroup2 = null;
                    if (zDecodeSequentially) {
                        PolicyConfigGroup.Companion companion = PolicyConfigGroup.INSTANCE;
                        policyConfigGroup = (PolicyConfigGroup) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, companion.serializer(kSerializer), null);
                        map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, new LinkedHashMapSerializer(StringSerializer.f18170a, companion.serializer(kSerializer)), null);
                        i = 3;
                    } else {
                        boolean z = true;
                        int i2 = 0;
                        Map map2 = null;
                        while (z) {
                            int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                            if (iDecodeElementIndex == -1) {
                                z = false;
                            } else if (iDecodeElementIndex == 0) {
                                policyConfigGroup2 = (PolicyConfigGroup) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, PolicyConfigGroup.INSTANCE.serializer(kSerializer), policyConfigGroup2);
                                i2 |= 1;
                            } else {
                                if (iDecodeElementIndex != 1) {
                                    throw new UnknownFieldException(iDecodeElementIndex);
                                }
                                map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, new LinkedHashMapSerializer(StringSerializer.f18170a, PolicyConfigGroup.INSTANCE.serializer(kSerializer)), map2);
                                i2 |= 2;
                            }
                        }
                        i = i2;
                        policyConfigGroup = policyConfigGroup2;
                        map = map2;
                    }
                    compositeDecoderBeginStructure.endStructure(serialDescriptor);
                    return new PolicyRemoteConfig(i, policyConfigGroup, map);
                }

                @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
                public final SerialDescriptor getDescriptor() {
                    return this.descriptor;
                }

                @Override // kotlinx.serialization.SerializationStrategy
                public final void serialize(Encoder encoder, Object obj) {
                    PolicyRemoteConfig value = (PolicyRemoteConfig) obj;
                    Intrinsics.i(value, "value");
                    Map map = value.b;
                    PolicyConfigGroup policyConfigGroup = value.f1017a;
                    SerialDescriptor serialDescriptor = this.descriptor;
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                    PolicyRemoteConfig.Companion companion = PolicyRemoteConfig.INSTANCE;
                    boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0);
                    KSerializer<T> kSerializer = typeSerial0;
                    if (zShouldEncodeElementDefault || policyConfigGroup != null) {
                        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, PolicyConfigGroup.INSTANCE.serializer(kSerializer), policyConfigGroup);
                    }
                    if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.d(map, MapsKt.d())) {
                        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, new LinkedHashMapSerializer(StringSerializer.f18170a, PolicyConfigGroup.INSTANCE.serializer(kSerializer)), map);
                    }
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }

                @Override // kotlinx.serialization.internal.GeneratedSerializer
                public final KSerializer[] typeParametersSerializers() {
                    return new KSerializer[]{typeSerial0};
                }
            };
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.behaviour.policy.PolicyRemoteConfig", null, 2);
        pluginGeneratedSerialDescriptor.j("common", true);
        pluginGeneratedSerialDescriptor.j("brands", true);
    }

    public /* synthetic */ PolicyRemoteConfig(int i, PolicyConfigGroup policyConfigGroup, Map map) {
        this.f1017a = (i & 1) == 0 ? null : policyConfigGroup;
        if ((i & 2) == 0) {
            this.b = MapsKt.d();
        } else {
            this.b = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolicyRemoteConfig)) {
            return false;
        }
        PolicyRemoteConfig policyRemoteConfig = (PolicyRemoteConfig) obj;
        return Intrinsics.d(this.f1017a, policyRemoteConfig.f1017a) && Intrinsics.d(this.b, policyRemoteConfig.b);
    }

    public final int hashCode() {
        PolicyConfigGroup policyConfigGroup = this.f1017a;
        return this.b.hashCode() + ((policyConfigGroup == null ? 0 : policyConfigGroup.hashCode()) * 31);
    }

    public final String toString() {
        return "PolicyRemoteConfig(common=" + this.f1017a + ", brands=" + this.b + ")";
    }
}
