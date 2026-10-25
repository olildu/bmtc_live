package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel$$serializer;
import com.inmobi.media.C2533k0;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmPassPurchaseStateKeeperMeta.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmPassPurchaseStateKeeperMeta;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ConfirmPassPurchaseStateKeeperMeta$$serializer implements GeneratedSerializer<ConfirmPassPurchaseStateKeeperMeta> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConfirmPassPurchaseStateKeeperMeta$$serializer f8360a;
    private static final SerialDescriptor descriptor;

    static {
        ConfirmPassPurchaseStateKeeperMeta$$serializer confirmPassPurchaseStateKeeperMeta$$serializer = new ConfirmPassPurchaseStateKeeperMeta$$serializer();
        f8360a = confirmPassPurchaseStateKeeperMeta$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmPassPurchaseStateKeeperMeta", confirmPassPurchaseStateKeeperMeta$$serializer, 2);
        pluginGeneratedSerialDescriptor.j(C2533k0.KEY_REQUEST_ID, false);
        pluginGeneratedSerialDescriptor.j("order", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StringSerializer.f18170a, CreateOrderResponseAppModel$$serializer.f5639a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String strDecodeStringElement;
        CreateOrderResponseAppModel createOrderResponseAppModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            createOrderResponseAppModel = (CreateOrderResponseAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, CreateOrderResponseAppModel$$serializer.f5639a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            CreateOrderResponseAppModel createOrderResponseAppModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    createOrderResponseAppModel2 = (CreateOrderResponseAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, CreateOrderResponseAppModel$$serializer.f5639a, createOrderResponseAppModel2);
                    i2 |= 2;
                }
            }
            i = i2;
            strDecodeStringElement = strDecodeStringElement2;
            createOrderResponseAppModel = createOrderResponseAppModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ConfirmPassPurchaseStateKeeperMeta(i, strDecodeStringElement, createOrderResponseAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ConfirmPassPurchaseStateKeeperMeta value = (ConfirmPassPurchaseStateKeeperMeta) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ConfirmPassPurchaseStateKeeperMeta.Companion companion = ConfirmPassPurchaseStateKeeperMeta.INSTANCE;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f9041a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, CreateOrderResponseAppModel$$serializer.f5639a, value.b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
